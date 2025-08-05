package br.com.techlead.livros_api.resource;

import br.com.techlead.livros_api.dto.LivroDTO;
import br.com.techlead.livros_api.dto.LivroRespostaDTO;
import br.com.techlead.livros_api.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
@Tag(name = "Livros", description = "Operações para gerenciamento de livros")
public class LivroController {

    private final LivroService livroService;
    @Operation(summary = "Criar um novo livro", description = "Cria um novo livro no sistema com os dados fornecidos.")
    @PostMapping
    public ResponseEntity<LivroRespostaDTO> criar(@RequestBody @Valid LivroDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.salvar(dto));
    }

    @Operation(summary = "Listar livros", description = "Retorna uma lista de todos os livros cadastrados.")
    @GetMapping
    public List<LivroRespostaDTO> listar() {
        return livroService.listar();
    }

    @Operation(summary = "Buscar livro por ID", description = "Retorna os dados de um livro com base no seu ID.")
    @GetMapping("/{id}")
    public LivroRespostaDTO buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id);
    }

    @Operation(summary = "Atualizar livro", description = "Atualiza os dados de um livro existente com base no ID.")
    @PutMapping("/{id}")
    public LivroRespostaDTO atualizar(@PathVariable Long id, @RequestBody @Valid LivroDTO dto) {
        return livroService.atualizar(id, dto);
    }

    @Operation(summary = "Remover livro", description = "Exclui um livro do sistema com base no ID informado.")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        livroService.remover(id);
        return ResponseEntity.noContent().build();
    }
}

