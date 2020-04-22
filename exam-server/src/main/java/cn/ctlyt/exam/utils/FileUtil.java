package cn.ctlyt.exam.utils;

import cn.ctlyt.exam.exception.BizException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

/**
 * @ClassNameFileUtil
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/22 0022 19:55
 * @Version V1.0
 **/
public class FileUtil {
    private static final Path fileStorageLocation; // 文件在本地存储的地址
    static  {
        fileStorageLocation = Paths.get(Constant.FILE_UPLOAD_DIR).toAbsolutePath().normalize();
        try {
            Files.createDirectories(fileStorageLocation);
        } catch (Exception ex) {
            throw new BizException("无法创建文件夹");
        }
    }
    /**
     * 存储文件到系统
     *
     * @param file 文件
     * @return 文件名
     */
    public static String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        fileName = Constant.JWT_ID+new Date().getTime()+"_"+(int)(Math.random()*100)+fileName.substring(fileName.lastIndexOf("."),fileName.length());
        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new BizException("无效的路径序列");
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
            throw new BizException("文件上传失败");
        }
    }

    /**
     * 加载文件
     * @param fileName 文件名
     * @return 文件
     */
    public static Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new BizException("文件未找到");
            }
        } catch (MalformedURLException ex) {
            throw new BizException("文件未找到");
        }
    }
}
