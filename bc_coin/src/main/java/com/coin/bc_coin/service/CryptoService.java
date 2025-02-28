package com.coin.bc_coin.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coin.bc_coin.model.CryptoCurrency;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CryptoService {
    private static final String API_URL = 
      "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1";
    
    @Autowired
    private RestTemplate restTemplate;

    public List<CryptoCurrency> getCryptoData() {
        CryptoCurrency[] response = restTemplate.getForObject(API_URL, CryptoCurrency[].class);
        return Arrays.asList(response != null ? response : new CryptoCurrency[0]);
    }
}