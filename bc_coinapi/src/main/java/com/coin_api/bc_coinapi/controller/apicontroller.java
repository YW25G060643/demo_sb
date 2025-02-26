package com.coin_api.bc_coinapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coin_api.bc_coinapi.service.apiservice;

@RestController
@RequestMapping("/api")
public class apicontroller {

    @Autowired
    private apiservice apiservice;

    @GetMapping("/Data")
    public String getCoinData() {
        return apiservice.getCoinData();
    }
}