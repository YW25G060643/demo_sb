package com.coin.bc_coin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BcCoinApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcCoinApplication.class, args);
	}
}
