package com.example.ss10_bt1.service;

import com.example.ss10_bt1.entity.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerService {
    List<Customer> list = new ArrayList<>();
    public CustomerService() {
        list.add(new Customer(1L,"tiep cc", new Date(),"ha noi","https://duhocvietglobal.com/wp-content/uploads/2018/12/dat-nuoc-va-con-nguoi-anh-quoc.jpg"));
        list.add(new Customer(2L,"hai tran", new Date(),"ha noi","https://cdn.chanhtuoi.com/uploads/2020/05/icon-facebook-34-1.jpg.webp"));
        list.add(new Customer(3L,"duc tran", new Date(),"ha noi","https://hoanghamobile.com/tin-tuc/wp-content/uploads/2024/02/icon-la-gi-4.jpg"));
        list.add(new Customer(4L,"pinh tran", new Date(),"ha noi","https://thuthuatnhanh.com/wp-content/uploads/2022/08/hinh-mat-cuoi-deo-kinh-cute.jpg"));
    }
    public List<Customer> findAll()
    {
        return list;
    }
}
