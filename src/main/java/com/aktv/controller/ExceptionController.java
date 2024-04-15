package com.aktv.controller;

import com.aktv.Exception.BusinessErrorException;
import com.aktv.Exception.BusinessMsgEnum;
import com.aktv.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @RequestMapping("/business")
    public void testException(){
        try{
            int i=1/0;
        }catch (Exception e){
            throw new BusinessErrorException(BusinessMsgEnum.UNEXPECTED_EXCEPTION);
        }

    }
}
