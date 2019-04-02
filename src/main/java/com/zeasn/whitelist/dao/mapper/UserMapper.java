package com.zeasn.whitelist.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zeasn.whitelist.dao.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    @Select("SELECT * FROM user where ${ew.sqlSegment}")
    List<User> selectList(Page<User> page, @Param("ew") Wrapper<User> wrapper);
}