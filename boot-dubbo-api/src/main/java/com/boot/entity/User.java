package com.boot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author by yyz
 * on 2018/6/5
 */

@Data
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
