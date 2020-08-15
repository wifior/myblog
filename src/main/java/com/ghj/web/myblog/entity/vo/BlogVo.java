package com.ghj.web.myblog.entity.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.ghj.web.myblog.entity.Type;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogVo {
    private Long id;

   /* alter table t_blog
    add type_id bigint(11) null;*/

    private Type type;
    private Integer tp;

    private String title;

    private String content;

    private String firstPicture;

    private String flag;

    private Integer views;

    private Boolean appreciation;

    private Boolean shareStatement;

    private Boolean commentabled;

    private Boolean published;

    private Boolean recommend;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
