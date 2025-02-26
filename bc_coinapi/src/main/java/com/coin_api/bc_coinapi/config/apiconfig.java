package com.coin_api.bc_coinapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class apiconfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}