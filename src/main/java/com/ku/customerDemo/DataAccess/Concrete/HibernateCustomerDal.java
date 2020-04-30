package com.ku.customerDemo.DataAccess.Concrete;

import com.ku.customerDemo.DataAccess.Abstract.ICustomerDal;
import com.ku.customerDemo.Entities.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateCustomerDal implements ICustomerDal {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Customer> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Customer> customers = session.createQuery("from Customer", Customer.class).getResultList();
        return customers;
    }

    @Override
    @Transactional
    public void add(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        Customer customerDeleted = session.get(Customer.class, customer.customer_id);
        session.delete(customerDeleted);
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public Customer getById(int customerId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Customer.class, customerId);
    }
}
