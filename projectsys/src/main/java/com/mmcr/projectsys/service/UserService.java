package com.mmcr.projectsys.service;

import com.mmcr.projectsys.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/2/12.
 */
public interface UserService {
    User getUserById(Long id);

    List<User> getUserList();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);
}
