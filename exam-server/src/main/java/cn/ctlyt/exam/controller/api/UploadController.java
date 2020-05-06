package cn.ctlyt.exam.controller.api;


import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.UploadFile;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.UploadFileService;
import cn.ctlyt.exam.service.UserService;
import cn.ctlyt.exam.utils.Constant;
import cn.ctlyt.exam.utils.FileTypeUtil;
import cn.ctlyt.exam.utils.FileUtil;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.UUID;

import static cn.ctlyt.exam.utils.Constant.FILE_UPLOAD_DIR;

/**
 * @ClassNameUploadContrellor
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/22 0022 19:44
 * @Version V1.0
 **/
@RestController
@RequestMapping("api/upload")
public class UploadController {
    @Autowired
    UploadFileService uploadFileService;
    @Autowired
    UserService userService;
    @PostMapping("/uploadFile")
    public Result uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        String header = request.getHeader(Constant.TOKEN_HEADER);
        User userByJwt = User.getUserByJwt(header);
        UploadFile add = uploadFileService.add(file, userByJwt.getU_id());
        if(add==null){
            throw new BizException("文件上传失败");
        }
        return ResultGenerator.genSuccessResult(add);
    }
    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = FileUtil.loadFileAsResource(fileName);
        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

    /*
     * 功能描述：获取文件列表
     * @param isMaster 所有还是个人上传
     * @return
     * @Author: 村头老杨头
     * @Date: 2020/4/23 0023 0:26
     *
     */
    @PostMapping("/filelist")
    public Result getFileList(HttpServletRequest request,@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize,@RequestParam(value = "ismaster",defaultValue = "false")Boolean isMaster){
        String header = request.getHeader(Constant.TOKEN_HEADER);
        User userByJwt = User.getUserByJwt(header);
        PageInfo fileList = uploadFileService.getFileList(pageNo, pageSize, isMaster, userByJwt.getU_id());
        return ResultGenerator.genSuccessResult(fileList);
    }
    @PostMapping("/base64upload")
    public Result uploadImage(HttpServletRequest request,String img){
        String dataPrix = ""; //base64格式前头
        String data = "";//实体部分数据
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if(user!=null){
            if(img==null||"".equals(img)){
                return ResultGenerator.genFailResult("上传失败，上传图片数据为空");
            }else {
                String [] d = img.split("base64,");//将字符串分成数组
                if(d != null && d.length == 2){
                    dataPrix = d[0];
                    data = d[1];
                }else {
                    return ResultGenerator.genFailResult("上传失败，数据不合法");
                }
            }
            String suffix = "";//图片后缀，用以识别哪种格式数据
            //data:image/jpeg;base64,base64编码的jpeg图片数据
            if("data:image/jpeg;".equalsIgnoreCase(dataPrix)){
                suffix = ".jpg";
            }else if("data:image/x-icon;".equalsIgnoreCase(dataPrix)){
                //data:image/x-icon;base64,base64编码的icon图片数据
                suffix = ".ico";
            }else if("data:image/gif;".equalsIgnoreCase(dataPrix)){
                //data:image/gif;base64,base64编码的gif图片数据
                suffix = ".gif";
            }else if("data:image/png;".equalsIgnoreCase(dataPrix)){
                //data:image/png;base64,base64编码的png图片数据
                suffix = ".png";
            }else {
                return ResultGenerator.genFailResult("上传图片格式不合法");
            }
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String tempFileName=uuid+suffix;
            String imgFilePath = FILE_UPLOAD_DIR+"/"+tempFileName;//新生成的图片
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                //Base64解码
                byte[] b = decoder.decodeBuffer(data);
                for(int i=0;i<b.length;++i) {
                    if(b[i]<0) {
                        //调整异常数据
                        b[i]+=256;
                    }
                }
                OutputStream out = new FileOutputStream(imgFilePath);
                out.write(b);
                out.flush();
                out.close();
                //String imgurl="http://xxxxxxxx/"+tempFileName;
                String fileType = FileTypeUtil.getFileType(Constant.FILE_UPLOAD_DIR + "/" + tempFileName);
                File file = new File(FILE_UPLOAD_DIR + "/" + tempFileName);
                long length = file.length();
                UploadFile uploadFile = new UploadFile(new Date(),fileType,Constant.getServletFileUpload()+tempFileName,tempFileName,tempFileName,length,user.getU_id());
                user.setAvatar(uploadFile.getFileurl());
                userService.updateUser(user);
                request.setAttribute("uesr",user);
                uploadFileService.addFile(uploadFile);
                return ResultGenerator.genSuccessResult(uploadFile).setMessage("修改头像成功");
            } catch (IOException e) {
                e.printStackTrace();
                return ResultGenerator.genFailResult("上传图片失败");
            }
        }else{
            return ResultGenerator.genUnauthorizedResult().setMessage("没有权限");
        }
    }
}
