package com.valorDolar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/api/")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class DolarController {


    private final RestTemplate restTemplate;

    @GetMapping()
    public List<Object> getAll(){
        String url4= "https://www.datos.gov.co/resource/ceyp-9c7c.json";
        Object[] list = restTemplate.getForObject(url4,Object[].class);
        return Arrays.asList(list);
    }
}
