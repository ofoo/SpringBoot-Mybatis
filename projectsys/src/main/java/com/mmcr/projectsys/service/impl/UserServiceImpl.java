package com.mmcr.projectsys.service.impl;

import com.mmcr.projectsys.entity.User;
import com.mmcr.projectsys.mapper.UserMapper;
import com.mmcr.projectsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/2/12.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int addUser(User user) {
        user.setAddTime(new Date());
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteUser(id);
    }
}
