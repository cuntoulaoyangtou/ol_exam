package cn.ctlyt.exam.vo;

import java.util.List;

/**
 * @ClassNameTree
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/16 0016 10:51
 * @Version V1.0
 **/
public class Tree {
    private Object label;
    private Object value;
    private List<Tree> children;

    public Tree() {
    }

    public Tree(Object label, Object value) {
        this.label = label;
        this.value = value;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }
}
