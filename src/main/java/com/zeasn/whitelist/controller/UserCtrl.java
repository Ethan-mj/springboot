package com.zeasn.whitelist.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zeasn.whitelist.dao.entity.User;
import com.zeasn.whitelist.dao.mapper.UserMapper;
import com.zeasn.whitelist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public List<User> getMusicInfo() {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.eq("name",3);
        Page<User> page = new Page<>(1, 10);
//        List<User> list = userMapper.selectList(page , qw);
        List<User> list = userMapper.selectAll();
        User user = userMapper.findByName("user1");
        return list;
    }
}
