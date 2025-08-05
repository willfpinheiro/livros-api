package br.com.techlead.livros_api.entidade;

import jakarta.persistence.*;
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
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Column(name = "autor_id")
    private Long autorId;
}
