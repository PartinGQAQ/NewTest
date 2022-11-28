package com.example.demo32323.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "自定义实体",description = "MyEntity")
public class Myentity implements Serializable {
    @ApiModelProperty(value = "主键",name = "主键(id)",example = "1",hidden = false)
    private String id;
    @ApiModelProperty(value = "姓名",name = "姓名(name)",example = "马瑞祺",hidden = false)
    private String name;
    @ApiModelProperty(value = "密码",name = "密码(password)",example = "Mr23232",hidden = false)
    private String password;

    public Myentity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
