package org.fly.demo.service.impl;

import org.fly.demo.entity.User;
import org.fly.demo.mapper.UserMapper;
import org.fly.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.selectList(null);
    }
}
