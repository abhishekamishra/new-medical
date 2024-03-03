package com.med.newmedical.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServicesController {

    @GetMapping
    public void getServicesNames(){
        System.out.println("Inside services controller.");
    }
}
