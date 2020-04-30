package com.ku.customerDemo.Business.Concrete;

import com.ku.customerDemo.Business.Abstract.ICustomerService;
import com.ku.customerDemo.DataAccess.Abstract.ICustomerDal;
import com.ku.customerDemo.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService {

    @Autowired
    private ICustomerDal _customerDal;

    @Override
    @Transactional
    public List<Customer> getAll() {
        return _customerDal.getAll();
    }

    @Override
    @Transactional
    public void add(Customer customer) {
        _customerDal.add(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        _customerDal.delete(customer);
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        _customerDal.update(customer);
    }

    @Override
    @Transactional
    public Customer getById(int customerId) {
        return _customerDal.getById(customerId);
    }
}
