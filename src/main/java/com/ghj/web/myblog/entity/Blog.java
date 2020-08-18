package com.ghj.web.myblog.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Data
@Getter
@Setter
@TableName("t_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

   /* alter table t_blog
    add type_id bigint(11) null;*/

    @TableField("type_id")
    private Long typeId;

    private String title;

    private String content;

    @TableField("firstPicture")
    private String firstPicture;

    private String flag;
    private String description;

    private Integer views;

    private Boolean appreciation;

    private Boolean shareStatement;

    private Boolean commentabled;

    private Boolean published;

    private Boolean recommend;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;



}
