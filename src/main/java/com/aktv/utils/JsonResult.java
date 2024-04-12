package com.aktv.utils;

import com.aktv.dao.User;
import lombok.Data;

@Data
public class JsonResult<T> {
    private T obj;
    private String code;
    private String msg;

    public JsonResult() {
        this.code="200";
        this.msg="操作成功！";
    }

    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T obj,String code,String msg){
        this.obj=obj;
        this.code=code;
        this.msg=msg;
    }

    public JsonResult(T obj){
        this.obj = obj;
        this.code = "0";
        this.msg = "操作成功！";
    }
}
