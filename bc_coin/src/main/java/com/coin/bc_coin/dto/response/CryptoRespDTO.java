package com.coin.bc_coin.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CryptoRespDTO {
    private String formattedPrice;
    private String changeStatus;
    private String logoUrl;
    private String priceTrend;

}
