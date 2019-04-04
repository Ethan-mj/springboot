package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

public class Permission implements Serializable {
    @Id
    private Long pid;

    private String pname;

    private static final long serialVersionUID = 1L;

    @Transient
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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

    /**
     * @return pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }
}