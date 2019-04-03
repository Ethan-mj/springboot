package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Table: user_role
 */
@Table(name = "user_role")
public class UserRole implements Serializable {
    /**
     * Table:     user_role
     * Column:    uid
     * Nullable:  false
     */
    private Long uid;

    /**
     * Table:     user_role
     * Column:    rid
     * Nullable:  false
     */
    private Long rid;

    private static final long serialVersionUID = 1L;

    /**
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

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
}