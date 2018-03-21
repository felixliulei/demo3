package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Demo {
    @ApiModelProperty("id")
    private long id;
    @ApiModelProperty("姓名")
    private String cat_name;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return cat_name;
    }
    public void setName(String cat_name) {
        this.cat_name = cat_name;
    }
}
