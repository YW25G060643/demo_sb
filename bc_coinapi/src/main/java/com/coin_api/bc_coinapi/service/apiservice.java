package com.coin_api.bc_coinapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class apiservice {

    @Autowired
    private RestTemplate restTemplate;

    public String getCoinData() {
        String url = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}