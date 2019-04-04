package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "role_permission")
public class RolePermission implements Serializable {
    private Long rid;

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