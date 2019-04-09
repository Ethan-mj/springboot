package com.zeasn.whitelist.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zeasn.whitelist.dao.entity.User;
import com.zeasn.whitelist.dao.mapper.UserMapper;
import com.zeasn.whitelist.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value ="/getUser", method= RequestMethod.GET)
    @ApiOperation(value="根据用户编号获取用户姓名", notes="根据id查找用户")
    @ApiImplicitParam(paramType="query", name = "userNumber", value = "用户编号", required = true, dataType = "Integer")
    public List<User> getMusicInfo(int userNumber,Date date) {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.eq("name",3);
        Page<User> page = new Page<>(1, 10);
//        List<User> list = userMapper.selectList(page , qw);
        List<User> list = userMapper.selectAll();
        User user = userMapper.findByName("user1");
        return list;
    }
}
