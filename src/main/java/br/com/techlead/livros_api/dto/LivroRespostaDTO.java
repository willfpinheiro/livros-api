package br.com.techlead.livros_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroRespostaDTO {
    private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal preco;
    private LocalDate dataPublicacao;
    private Long autorId;
}
