package com.chinasofti.supermark.domain;

import java.io.Serializable;

public class Dish implements Serializable {
    private static final long serialVersionUID = 2L;
    private Integer id;
    private String dname;
    private Double price;
    private Integer count;
    private Integer cateId;//这里应该填写一个对象

    public Dish(Integer id, String dname, Double price, Integer count, Integer cateId) {
        this.id = id;
        this.dname = dname;
        this.price = price;
        this.count = count;
        this.cateId = cateId;
    }

    public Dish(String dname, Double price, Integer count, Integer cateId) {
        this.dname = dname;
        this.price = price;
        this.count = count;
        this.cateId = cateId;
    }

    public Dish() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    @Override
    public String toString() {
        return this.id+"\t"+this.dname+"\t"+this.price+"\t"+this.count+"\t"+cateId;
    }
}
