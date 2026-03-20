package com.tadeu.municipios.controller;

import com.tadeu.municipios.model.Municipio;
import com.tadeu.municipios.service.MunicipioService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MunicipioController {

    private final MunicipioService service;

    public MunicipioController(MunicipioService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(@RequestParam(required = false) String nome, Model model) {

        List<Municipio> municipios = service.buscarMunicipios(nome);

        model.addAttribute("municipios", municipios);
        model.addAttribute("nome", nome);

        return "index";
    }
}