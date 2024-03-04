package com.med.newmedical.util;

import com.med.newmedical.dto.ServicesDetailsDtos;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ServicesRESTCalls {

    private static final RestTemplate restTemplate = new RestTemplate();

    public static ResponseEntity<List<ServicesDetailsDtos>> getServicesDetails() {
        return restTemplate.exchange("http://localhost:8081/details", HttpMethod.GET, null, new ParameterizedTypeReference<List<ServicesDetailsDtos>>() {
        });
    }
}
