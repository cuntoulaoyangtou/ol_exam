package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program: exam
 * @description: 文件
 * @author: 村头老杨头
 * @create: 2020-04-22 22:01
 */
@Table(name = "a_file")
@NameStyle(Style.normal)
public class UploadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long f_id;
    private Date uploaddate;
    private String type;
    private String fileurl;
    private String filename;
    private Long filesize;
    private Integer uid;

    public UploadFile(){

    }
    public UploadFile(Date uploaddate, String type, String fileurl, String filename, Long filesize, Integer uid) {
        this.uploaddate = uploaddate;
        this.type = type;
        this.fileurl = fileurl;
        this.filename = filename;
        this.filesize = filesize;
        this.uid = uid;
    }

    public Long getF_id() {
        return f_id;
    }

    public void setF_id(Long f_id) {
        this.f_id = f_id;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}