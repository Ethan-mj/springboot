package com.zeasn.whitelist.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Table: user
 */
@Data
public class User implements Serializable {
    /**
     * Table:     user
     * Column:    name
     * Nullable:  true
     */
    private String name;

    private static final long serialVersionUID = 1L;
}