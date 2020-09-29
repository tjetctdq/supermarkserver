package com.chinasofti.supermark.domain;

import java.io.Serializable;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cname;

    public Category() {
    }

    public Category(String cname) {
        this.cname = cname;
    }

    public Category(Integer id, String cname) {

        this.id = id;
        this.cname = cname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return this.id+"\t"+this.cname;
    }
}
