package com.zhj.rbac.repositery;

import com.zhj.rbac.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleDao extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
    /**
     * 根据用户id 查询角色列表
     *
     * @param userId 用户id
     * @return 角色列表
     */
    @Query(value = "SELECT sec_role.* FROM sec_role,sec_user,sec_user_role WHERE sec_user.id = sec_user_role.user_id AND sec_role.id = sec_user_role.role_id AND sec_user.id = :userId", nativeQuery = true)
    List<Role> selectByUserId(@Param("userId") Long userId);
}

