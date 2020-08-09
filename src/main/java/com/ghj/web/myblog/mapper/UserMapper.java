package com.ghj.web.myblog.mapper;

import com.ghj.web.myblog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface UserMapper extends BaseMapper<User> {

    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
