package com.meuscursos.springwebapi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record FraseDTO( String titulo,
                        String frase,
                        String personagem,
                        String poster) {
}
