package com.ku.customerDemo.RestAPI;

import com.ku.customerDemo.Business.Abstract.ICustomerService;
import com.ku.customerDemo.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ICustomerService _customerService;

    @GetMapping("/customers")
    public List<Customer> get(){
        return _customerService.getAll();
    }

    @PostMapping("/customers/add")
    public void add(@RequestBody Customer customer){
        _customerService.add(customer);
    }

    @DeleteMapping("/customers/delete")
    public void delete(@RequestBody Customer customer){
        _customerService.delete(customer);
    }

    @PutMapping("/customers/update")
    public void update(@RequestBody Customer customer){
        _customerService.update(customer);
    }

    @GetMapping("/customers/{customerId}")
    public Customer getById(@PathVariable int customerId){
        return _customerService.getById(customerId);
    }
}
