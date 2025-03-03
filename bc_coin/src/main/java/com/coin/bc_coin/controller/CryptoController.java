package com.coin.bc_coin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.coin.bc_coin.service.CryptoService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class CryptoController {
    private final CryptoService cryptoService;

    @GetMapping("/CryptoInfo")
    public String Name(Model model) {
        model.addAttribute("cryptos", cryptoService.getCryptoData());
        return "index";
    }
    
}