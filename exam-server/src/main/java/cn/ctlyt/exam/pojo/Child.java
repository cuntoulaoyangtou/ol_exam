package cn.ctlyt.exam.pojo;

import java.util.List;

/**
 * @ClassNameChild
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/27 0027 3:00
 * @Version V1.0
 **/
public class Child {
    private String name;
    private List<Child> childList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", childList=" + childList +
                '}';
    }
}
