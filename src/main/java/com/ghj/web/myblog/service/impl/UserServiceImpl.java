package com.ghj.web.myblog.service.impl;

import com.ghj.web.myblog.entity.User;
import com.ghj.web.myblog.mapper.UserMapper;
import com.ghj.web.myblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.findUserByUsernameAndPassword(username,password);
        return user;
    }
}
