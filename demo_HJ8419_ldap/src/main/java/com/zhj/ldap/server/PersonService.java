package com.zhj.ldap.server;

import com.zhj.ldap.LoginRequest;
import com.zhj.ldap.api.Result;
import com.zhj.ldap.entity.Person;

public interface PersonService {

    /**
     * 登录
     *
     * @param request {@link LoginRequest}
     * @return {@link Result}
     */
    Result login(LoginRequest request);

    /**
     * 查询全部
     *
     * @return {@link Result}
     */
    Result listAllPerson();

    /**
     * 保存
     *
     * @param person {@link Person}
     */
    void save(Person person);

    /**
     * 删除
     *
     * @param person {@link Person}
     */
    void delete(Person person);

}

