package com.coin.bc_coin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coin.bc_coin.service.CryptoService;

import lombok.RequiredArgsConstructor;

import org.springframework.ui.Model;


@Controller
@RequiredArgsConstructor
public class CryptoController {
    @Autowired
    private CryptoService cryptoService;

    @GetMapping("/")
    public String Name(Model model) {
        model.addAttribute("cryptos", cryptoService.getCryptoData());
        return "index";
    }
    
}