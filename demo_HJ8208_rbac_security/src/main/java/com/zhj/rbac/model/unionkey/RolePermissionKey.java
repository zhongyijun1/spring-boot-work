package com.zhj.rbac.model.unionkey;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class RolePermissionKey implements Serializable {
    private static final long serialVersionUID = 6850974328279713855L;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @Column(name = "permission_id")
    private Long permissionId;
}
