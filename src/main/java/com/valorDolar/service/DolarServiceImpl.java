package com.valorDolar.service;

import com.valorDolar.model.Dolar;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DolarServiceImpl implements DolarService{

    @Value("${external.api.url}")
    private  String baseUrl;

    private final RestTemplate restTemplate;

    public DolarServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Dolar> getAll() {
       Dolar[] list = restTemplate.getForObject(baseUrl,Dolar[].class);
        return Arrays.asList(list);
    }


}
