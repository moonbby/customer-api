package com.moonbby.customerapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customers> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customers getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customers createCustomer(@RequestBody Customers customers) {
        return customerService.saveCustomer(customers);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
