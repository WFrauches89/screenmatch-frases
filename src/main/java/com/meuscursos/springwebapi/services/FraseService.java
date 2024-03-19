package com.meuscursos.springwebapi.services;

import com.meuscursos.springwebapi.dto.FraseDTO;
import com.meuscursos.springwebapi.model.Frase;
import com.meuscursos.springwebapi.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public List<FraseDTO> getFraseServ() {
        return convertSerieToSerieDTO(fraseRepository.findAll());

    }

    private List<FraseDTO> convertSerieToSerieDTO (List<Frase> frase) {
        return frase.stream()
                .map(f -> new FraseDTO(f.getFrase(),f.getPersonagem(),f.getTitulo(),f.getPoster()))
                .toList();
    }

    public FraseDTO getRandomFrasesServ() {
        Frase fraseRandom = fraseRepository.getRandom();
        return new FraseDTO(fraseRandom.getTitulo(),fraseRandom.getFrase(), fraseRandom.getPersonagem(),fraseRandom.getPoster());
    }
}
