package com.zeasn.whitelist.dao.mapper;

import com.zeasn.whitelist.dao.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
    List<User> getAllUser();
}