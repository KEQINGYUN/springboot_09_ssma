package com.itheima.controller.utils;

import com.itheima.domain.Book;
import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "flag=" + flag +
                ", data=" + data +
                '}';
    }

    public R(){

    }
    public R(Boolean flag){
        this.flag=flag;
    }

    public R(Boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }
}
