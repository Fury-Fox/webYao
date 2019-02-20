package org.fly.demo.service;

import org.fly.demo.entity.User;

import java.util.List;

public interface IUserService {

    public void addUser(User user);

    public List<User> findAllUsers();

}
