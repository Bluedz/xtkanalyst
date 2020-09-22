package com.xtk.xtkanalyst.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private String uid;

    private String username;

    private String password;

    public void setUid(String uid) {
        this.uid = uid;
    }
    public void setUsername(String psw) {
        this.password = psw;
    }
    public void setPassword(String name) {
        this.username = name;
    }
    private static final long serialVersionUID = 1L;
}