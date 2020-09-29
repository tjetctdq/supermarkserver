package com.chinasofti.supermark.domain;

import java.io.Serializable;

public class Items implements Serializable {
    private static final long serialVersionUID = 3L;
    private Integer id;
    private Integer did;
    private Integer num;
    private String oid;

    public Items(Integer id, Integer did, Integer num, String oid) {
        this.id = id;
        this.did = did;
        this.num = num;
        this.oid = oid;
    }

    public Items(Integer did, Integer num, String oid) {
        this.did = did;
        this.num = num;
        this.oid = oid;
    }

    public Items() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}
