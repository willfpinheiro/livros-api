package br.com.techlead.livros_api.repository;

import br.com.techlead.livros_api.entidade.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Long> {
}
