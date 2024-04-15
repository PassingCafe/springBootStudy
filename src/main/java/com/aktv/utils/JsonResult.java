package com.aktv.utils;


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

    public JsonResult(T obj){
        this.obj = obj;
        this.code = "0";
        this.msg = "操作成功！";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
