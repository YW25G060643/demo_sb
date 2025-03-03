package com.coin.bc_coin.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.coin.bc_coin.dto.response.CryptoRespDTO;
import com.coin.bc_coin.model.CryptoCurrency;
import com.coin.bc_coin.service.mapper.CryptoMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CryptoService {
    private final RestTemplate restTemplate;
    private final CryptoMapper cryptoMapper;

    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1";
    
    public List<CryptoRespDTO> getCryptoData() {
        CryptoCurrency[] entities = restTemplate.getForObject(API_URL, CryptoCurrency[].class);
        return Arrays.stream(entities)
            .map(cryptoMapper :: toCryptoRespDTO)
            .collect(Collectors.toList());
    }
}
