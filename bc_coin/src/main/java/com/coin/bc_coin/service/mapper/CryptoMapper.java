package com.coin.bc_coin.service.mapper;

import org.springframework.stereotype.Component;
import com.coin.bc_coin.dto.response.CryptoRespDTO;
import com.coin.bc_coin.model.CryptoCurrency;

@Component
public class CryptoMapper {
    public CryptoRespDTO toCryptoRespDTO(CryptoCurrency entity) {
        return CryptoRespDTO.builder()
            .formattedPrice(formatPrice(entity.getCurrent_price()))
            .changeStatus(entity.getPrice_change_percentage_24h() >= 0 ? "up" : "down")
            .logoUrl(entity.getImage())
            .priceTrend(entity.getPrice_change_percentage_24h() >= 0 ? "↑" : "↓")
            .build();
        }
    
        private String formatPrice(double price) {
            return "$" + String.format("$%.2f", price);
    }
}