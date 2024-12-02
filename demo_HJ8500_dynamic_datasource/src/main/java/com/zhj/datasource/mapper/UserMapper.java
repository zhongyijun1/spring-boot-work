package com.zhj.datasource.mapper;

import com.zhj.datasource.config.MyMapper;
import com.zhj.datasource.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}
