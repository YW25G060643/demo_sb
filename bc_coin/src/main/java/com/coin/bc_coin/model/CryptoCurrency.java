package com.coin.bc_coin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class CryptoCurrency{
    private String id;
    private String symbol;
    private String name;
    private String image;
    private double current_price;
    private double price_change_percentage_24h;
}