package com.example.test.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("分页参数")
public class PageParam {


    @ApiModelProperty("页码")
    private int current;

    @ApiModelProperty("每页数据量")
    private int size;

    public int getCurrent() {
        if(current==0){
            return 1;
        }
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        if(size==0){
            return 10;
        }
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
