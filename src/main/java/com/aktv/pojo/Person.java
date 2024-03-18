package com.aktv.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @autor:bobo
 * @data:2024.3.18
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String lastName;
    private Integer age;
    private Date birth;
    private Map<String, String> maps;
    private List<String> lists;
    private Dog dog;
    /**
     * 支持数据校验
     */
    @Email
    private String email;

}