package com.zeasn.whitelist.dao.mapper;

import com.zeasn.whitelist.dao.entity.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    User findByName(String name);
}