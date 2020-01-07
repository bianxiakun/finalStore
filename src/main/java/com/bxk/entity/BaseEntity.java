package com.bxk.entity;

import lombok.Data;

import java.util.Date;
@Data
public class BaseEntity {
    private Date createdTime;
    private String createdUser;
    private Date modifiedTime;
    private String modifiedUser;


}
