package com.zhj.beetlsql.dao;

import com.zhj.beetlsql.entity.User;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends BaseMapper<User> {

}
