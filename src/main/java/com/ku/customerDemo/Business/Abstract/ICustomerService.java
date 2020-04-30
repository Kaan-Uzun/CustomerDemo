package com.ku.customerDemo.Business.Abstract;

import com.ku.customerDemo.Entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAll();

    void add(Customer customer);

    void delete(Customer Customer);

    void update(Customer customer);

    Customer getById(int customerId);
}
