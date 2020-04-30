package com.ku.customerDemo.Business.Concrete;

import com.ku.customerDemo.Business.Abstract.IProductService;
import com.ku.customerDemo.DataAccess.Abstract.IProductDal;
import com.ku.customerDemo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductManager implements IProductService {

    @Autowired
    private IProductDal _productDal;

    @Override
    @Transactional
    public List<Product> getAll() {
        return _productDal.getAll();
    }

    @Override
    @Transactional
    public void add(Product product) {
        _productDal.add(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        _productDal.delete(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        _productDal.update(product);
    }

    @Override
    @Transactional
    public Product getById(int productId) {
        return _productDal.getById(productId);
    }
}
