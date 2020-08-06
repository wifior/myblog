package com.ghj.web.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String nickname;

    private String username;

    private String password;

    private String email;

    private String avatar;

    private Integer type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
