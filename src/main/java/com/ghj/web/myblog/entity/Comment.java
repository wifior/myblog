package com.ghj.web.myblog.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Data
@TableName("t_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;


    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;



}
