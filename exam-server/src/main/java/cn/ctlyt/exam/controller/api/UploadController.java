package cn.ctlyt.exam.controller.api;


import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.UploadFile;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.UploadFileService;
import cn.ctlyt.exam.utils.Constant;
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

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
}
