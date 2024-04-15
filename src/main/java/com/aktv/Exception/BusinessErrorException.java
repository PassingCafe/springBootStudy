package com.aktv.Exception;

import lombok.Data;

@Data
public class BusinessErrorException extends RuntimeException{
    private String code;
    private String message;

    public BusinessErrorException(BusinessMsgEnum businessMsgEnum){
        this.code= businessMsgEnum.getCode();
        this.message= businessMsgEnum.getMsg();
    }
}
