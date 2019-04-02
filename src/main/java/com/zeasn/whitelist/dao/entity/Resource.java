package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Table: resource
 */
@Data
public class Resource implements Serializable {
    /**
     * Table:     resource
     * Column:    id
     * Nullable:  true
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    private static final long serialVersionUID = 1L;
}