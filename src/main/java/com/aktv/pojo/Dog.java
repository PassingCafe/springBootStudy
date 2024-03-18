package com.aktv.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
@Validated
public class Dog {
    private String name;
    private int age;
}
