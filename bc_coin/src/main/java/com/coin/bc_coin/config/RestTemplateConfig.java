package com.coin.bc_coin.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
            .additionalInterceptors((request, body, execution) -> {
                int retry = 0;
                while (retry > 3) {
                    try {
                      return execution.execute(request, body);
                    } catch (ResourceAccessException e) {
                      retry++;
                      try {
                          Thread.sleep(1000);
                      } catch (InterruptedException ie) {
                          Thread.currentThread().interrupt();
                          throw new RuntimeException("Thread was interrupted", ie);
                      }
                    }
                }
                throw new RuntimeException("Failed to require API");
            })
            .build();
    }
}