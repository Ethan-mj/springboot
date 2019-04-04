package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

public class Role implements Serializable {
    @Id
    private Long rid;

    private String rname;

    private static final long serialVersionUID = 1L;

    @Transient
    private Set<User> users = new HashSet<>();

    @Transient
    private Set<Permission> permissions = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
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

    /**
     * @return rname
     */
    public String getRname() {
        return rname;
    }

    /**
     * @param rname
     */
    public void setRname(String rname) {
        this.rname = rname;
    }
}