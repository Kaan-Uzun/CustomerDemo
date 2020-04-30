package com.ku.customerDemo.Business.Abstract;

import com.ku.customerDemo.Entities.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAll();

    void add(Product product);

    void delete(Product product);

    void update(Product product);

    Product getById(int productId);

}
