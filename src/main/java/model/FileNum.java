package model;

import java.io.Serializable;

public class FileNum implements Serializable {
    private Long num;

    public FileNum() {}

    public FileNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
