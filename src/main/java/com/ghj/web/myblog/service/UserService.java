package com.ghj.web.myblog.service;

import com.ghj.web.myblog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface UserService extends IService<User> {

    User checkUser(String username,String password);
}
