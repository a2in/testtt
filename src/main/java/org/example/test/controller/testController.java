package org.example.test.controller;

import org.example.test.entity.Customer;
import org.example.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class testController {
    @Autowired
    private CustomerRepository y;
    @GetMapping("/h")
    public String h(Model m){
        ArrayList<Customer> cEL = y.findAll();
        m.addAttribute("cv", cEL);
        return "test/customer";
    }
}
