package com.zeasn.whitelist.service.impl;

import com.zeasn.whitelist.dao.domain.User;
import com.zeasn.whitelist.dao.mapper.UserMapper;
import com.zeasn.whitelist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> users = userMapper.selectAll();

        return users;
    }
}
