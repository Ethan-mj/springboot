package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Table: role
 */
public class Role implements Serializable {
    /**
     * Table:     role
     * Column:    rid
     * Nullable:  false
     */
    @Id
    private Long rid;

    /**
     * Table:     role
     * Column:    name
     * Nullable:  true
     */
    private String name;

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