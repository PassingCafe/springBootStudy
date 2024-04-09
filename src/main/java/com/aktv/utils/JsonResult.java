package com.aktv.utils;

import lombok.Data;

@Data
public class JsonResult {
    protected String code;
    protected String msg;

    public JsonResult() {
        this.code="200";
        this.msg="操作成功！";
    }

    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
