package com.meuscursos.springwebapi.controllers;

import com.meuscursos.springwebapi.dto.FraseDTO;
import com.meuscursos.springwebapi.model.Frase;
import com.meuscursos.springwebapi.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases/all")
    public List<FraseDTO> getFrases() {
        return fraseService.getFraseServ();
    }

    @GetMapping("/frases")
    public FraseDTO getRandomFrases() {
        return fraseService.getRandomFrasesServ();
    }


}
