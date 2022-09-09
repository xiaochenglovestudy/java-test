package com.example.test.common;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 7551485138236427661L;

    @Id
    @Column(name = "id", nullable = false)
    @TableId(value = "id", type = IdType.AUTO)
    private int id;


    /**
     * 创建人id
     */
    @Column(name = "createId")
    @TableField(fill = FieldFill.INSERT)
    protected String createId;

    /**
     * 更新人id
     */
    @Column(name = "updateId")
    @TableField(fill = FieldFill.UPDATE)
    protected String updateId;

    /**
     * 创建时间
     */
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @TableField(fill = FieldFill.INSERT)
    protected Date createTime;

    /**
     * 更新时间
     */
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @TableField(fill = FieldFill.UPDATE)
    protected Date updateTime;

    /**
     * 是否删除:0：否;1：是
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic(value = "0",delval = "1")
    protected String isDelete;

    /**
     * 版本号
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private int version;

}
