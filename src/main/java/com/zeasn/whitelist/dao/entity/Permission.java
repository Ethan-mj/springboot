package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Table: permission
 */
public class Permission implements Serializable {
    /**
     * Table:     permission
     * Column:    pid
     * Nullable:  false
     */
    @Id
    private Long pid;

    /**
     * Table:     permission
     * Column:    name
     * Nullable:  true
     */
    private String name;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}