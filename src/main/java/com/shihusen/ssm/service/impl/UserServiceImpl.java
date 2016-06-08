package com.shihusen.ssm.service.impl;

import com.shihusen.ssm.dao.UserMapper;
import com.shihusen.ssm.entity.User;
import com.shihusen.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shihusen on 16-6-2.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public int checkLogin(User user) {
        return userMapper.checkLogin(user);
    }
}
