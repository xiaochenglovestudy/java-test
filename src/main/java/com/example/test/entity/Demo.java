package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.test.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("demo")
@Table
@ApiModel(value = "Demo对象", description = "demo")
public class Demo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("密码")
    private String passWord;
}
