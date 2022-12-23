package com.valorDolar.controller;

import com.valorDolar.model.Dolar;
import com.valorDolar.service.DolarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/api/")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class DolarController {


    private final DolarService dolarService;

    @GetMapping()
    public List<Dolar> getAll(){
      return dolarService.getAll();
    }


}
