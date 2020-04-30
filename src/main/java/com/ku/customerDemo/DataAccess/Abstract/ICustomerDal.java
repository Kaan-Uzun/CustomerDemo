package com.ku.customerDemo.DataAccess.Abstract;

import com.ku.customerDemo.Entities.Customer;

import java.util.List;

public interface ICustomerDal {

    List<Customer> getAll();

    void add(Customer customer);

    void delete(Customer customer);

    void update(Customer customer);

    Customer getById(int customerId);
}
