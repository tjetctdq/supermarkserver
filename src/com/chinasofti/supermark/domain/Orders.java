package com.chinasofti.supermark.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Orders implements Serializable {
    private static final long serialVersionUID = 3L;
    private String id;
    private Date time;
    private Integer eid;
    //创建订单详情属性
    private List<Items> list;
    public Orders(String id, Date time, Integer eid) {
        this.id = id;
        this.time = time;
        this.eid = eid;
    }

    public Orders() {
    }

    public List<Items> getList() {
        return list;
    }

    public void setList(List<Items> list) {
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
