package com.bxk.entity;

import lombok.Data;

@Data
public class User extends  BaseEntity{
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String salt;
    private String phone;
    private String avatar;
    private Integer gender;
    private Integer isDelete;
}
