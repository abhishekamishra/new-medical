package com.med.newmedical.controller;

import com.med.newmedical.dto.ServicesDetailsDtos;
import com.med.newmedical.util.ServicesRESTCalls;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServicesDetailsController {

    @GetMapping
    public ResponseEntity<List<ServicesDetailsDtos>> getServicesNames(){
        System.out.println("Inside services controller.");
        // ref: https://www.apollohospitals.com/hyderabad/
        // preventive helath checks
        // cosmetic
        // eye
        // bio medical waste data
        // aneasthesia and intensive care
        // pain management
        // endometriosis
        // general surgery
        // sugar
        // BP

        return ServicesRESTCalls.getServicesDetails();
    }
}
