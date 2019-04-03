package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Table: user
 */
public class User implements Serializable {
    /**
     * Table:     user
     * Column:    id
     * Nullable:  false
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * Table:     user
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * Table:     user
     * Column:    password
     * Nullable:  true
     */
    private String password;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}