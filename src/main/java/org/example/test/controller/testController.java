package org.example.test.controller;

import org.example.test.entity.Customer;
import org.example.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class testController {
    @Autowired
    private CustomerRepository yiia;

    @GetMapping("")
    public String index() {
        return "test/infex";
    }

    @GetMapping("/h")
    public String h(Model m){
        ArrayList<Customer> cEL = yiia.findAll();
        m.addAttribute("cb", cEL);
        return "test/customer";
    }

    @GetMapping("/iwantgohome")
    public String iwantgohome() {
        return "test/iwantgohome";
    }
}
