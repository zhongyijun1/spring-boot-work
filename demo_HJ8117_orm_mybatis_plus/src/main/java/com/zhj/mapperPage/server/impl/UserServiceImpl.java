package com.zhj.mapperPage.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhj.mapperPage.entity.User;
import com.zhj.mapperPage.mapper.userMapper;
import com.zhj.mapperPage.server.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<userMapper, User> implements UserService {
}
