package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.UploadFileMapper;
import cn.ctlyt.exam.pojo.UploadFile;
import cn.ctlyt.exam.utils.Constant;
import cn.ctlyt.exam.utils.FileTypeUtil;
import cn.ctlyt.exam.utils.FileUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @program: exam
 * @description: 文件上传
 * @author: 村头老杨头
 * @create: 2020-04-22 22:06
 */
@Service
@Transactional
public class UploadFileService {
    @Autowired
    UploadFileMapper uploadFileMapper;

    public UploadFile add(MultipartFile file,Integer uid){
        if(file!= null){
            String primitive = StringUtils.cleanPath(file.getOriginalFilename());
            String fileName = FileUtil.storeFile(file);
            String fileDownloadUri = Constant.getServletFileUpload()+fileName;

            String fileType = FileTypeUtil.getFileType(Constant.FILE_UPLOAD_DIR + "/" + fileName);
            UploadFile uploadFile = new UploadFile(new Date(),fileType ,fileDownloadUri,primitive,fileName,file.getSize(),uid);
            uploadFileMapper.insert(uploadFile);
            return uploadFile;
        }
        return null;
    }
    public Integer addFile(UploadFile uploadFile){
        return uploadFileMapper.insert(uploadFile);
    }
    public PageInfo getFileList(Integer pageNo, Integer pageSize, Boolean isMaster,Integer uid){
        PageHelper.startPage(pageNo,pageSize);
        Example example = new Example(UploadFile.class);
        example.setOrderByClause("uploaddate desc");
        if(isMaster){
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("uid",uid);
            List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
            return new PageInfo<>(uploadFiles);
        }else{
            List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
            return new PageInfo(uploadFiles);
        }
    }

    public Integer delFile(String filename){
        File file = new File(Constant.FILE_UPLOAD_DIR+"/"+filename);
        if (file.exists()) {
            file.delete();
            System.out.println("文件已经被成功删除");
        }
        Example example = new Example(UploadFile.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("filename",filename);
        return uploadFileMapper.deleteByExample(example);
    }
    //文件清除
    public Integer clearFile(){
        //查询文件依赖
        List<UploadFile> uploadFiles = uploadFileMapper.selectAll();
        //查询文章
        //查询试题
        return 0;
    }

}