package cn.ctlyt.exam;

import cn.ctlyt.exam.pojo.Child;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SpringBootApplication
@MapperScan(basePackages = "cn.ctlyt.exam.mapper")
@ServletComponentScan
public class ExamApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);


        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("api.txt");
        List<Child> children = toConvertString(inputStream);
        List<String> apis = new ArrayList();
        for(Child child:children){
            for(Child child1 :child.getChildList()){
                for(Child child2 : child1.getChildList()){
                    apis.add(child.getName()+child1.getName()+child2.getName());
                }
            }
        }

        for(String str :apis){
            System.out.println(str);
        }

    }
    public static List<Child> toConvertString(InputStream is) {
        // 把字节流转化为字符流
        InputStreamReader isr = new InputStreamReader(is);
        // 普通的Reader读取输入内容时依然不太方便，可以将普通的
        // Reader再次包装成BufferedReader,利用BufferReader的readLine()
        // 方法可以一次读取一行内容
        List<Child> trees = new ArrayList<>();
        Map map = new HashMap();
        BufferedReader read = new BufferedReader(isr);
        try {
            String line;
            line = read.readLine();
            while (line != null) {
                if(Pattern.matches(".*#.*", line)){
                    line = read.readLine();
                    continue;
                }
                if(Pattern.matches("(^\\S).*", line)){
                    Child child = new Child();
                    child.setName(line);
                    child.setChildList(new ArrayList<>());
                    trees.add(child);
                    line = getTree(read,2,child);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != isr) {
                    isr.close();
                    isr.close();
                }
                if (null != read) {
                    read.close();
                    read = null;
                }
                if (null != is) {
                    is.close();
                    is = null;
                }
            } catch (IOException e) {
            }
        }
        return trees;
    }
    public static String getTree(BufferedReader read,int digit,Child child) throws IOException {
        String line = read.readLine();
        while (line!=null){
            if(Pattern.matches(".*#.*", line)){
                line = read.readLine();
                continue;
            }
            Child child1 = new Child();
            String reg = "^\\s{"+digit+"}.*";
            if(Pattern.matches(reg, line)){
                child1.setName(line.trim());
                child1.setChildList(new ArrayList<>());
                child.getChildList().add(child1);
                line = getTree(read,digit* 2,child1);
            }else{
                return line;
            }
        }
        return null;
    }
}
