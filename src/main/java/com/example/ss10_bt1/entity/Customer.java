package com.example.ss10_bt1.entity;
import java.util.Date;
public class Customer {
    private long id;
    private String name;
    private Date dob;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(long id, String name, Date dob,String address,  String image) {
        this.address = address;
        this.dob = dob;
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
