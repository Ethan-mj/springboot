package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Table: role_permission
 */
@Table(name = "role_permission")
public class RolePermission implements Serializable {
    /**
     * Table:     role_permission
     * Column:    rid
     * Nullable:  false
     */
    private Long rid;

    /**
     * Table:     role_permission
     * Column:    pid
     * Nullable:  true
     */
    private Long pid;

    private static final long serialVersionUID = 1L;

    /**
     * @return rid
     */
    public Long getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    /**
     * @return pid
     */
    public Long getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }
}