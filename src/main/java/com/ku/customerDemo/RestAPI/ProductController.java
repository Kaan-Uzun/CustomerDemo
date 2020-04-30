package com.ku.customerDemo.RestAPI;

import com.ku.customerDemo.Business.Abstract.IProductService;
import com.ku.customerDemo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private IProductService _productService;

    @GetMapping("/products")
    public List<Product> get(){
        return _productService.getAll();
    }

    @PostMapping("/products/add")
    public void add(@RequestBody Product product){
        _productService.add(product);
    }

    @PutMapping("/products/update")
    public void update(@RequestBody Product product){
        _productService.update(product);
    }

    @DeleteMapping("/products/delete")
    public void delete(@RequestBody Product product){
        _productService.delete(product);
    }

    @GetMapping("/products/{productId}")
    public Product getById(@PathVariable int productId){
        return _productService.getById(productId);
    }
}
