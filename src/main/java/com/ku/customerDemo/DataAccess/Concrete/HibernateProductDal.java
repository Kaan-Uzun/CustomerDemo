package com.ku.customerDemo.DataAccess.Concrete;

import com.ku.customerDemo.DataAccess.Abstract.IProductDal;
import com.ku.customerDemo.Entities.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateProductDal implements IProductDal {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Product> products = session.createQuery("from Product", Product.class).getResultList();
        return products;
    }

    @Override
    @Transactional
    public void add(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        Session session = entityManager.unwrap(Session.class);
        Product productDeleted = session.get(Product.class, product.product_id);
        session.delete(productDeleted);
    }

    @Override
    @Transactional
    public void update(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    @Transactional
    public Product getById(int productId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Product.class, productId);
    }
}
