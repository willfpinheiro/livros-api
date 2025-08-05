package br.com.techlead.livros_api.resource;

import br.com.techlead.livros_api.dto.LivroDTO;
import br.com.techlead.livros_api.dto.LivroRespostaDTO;
import br.com.techlead.livros_api.service.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroRespostaDTO> criar(@RequestBody @Valid LivroDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.salvar(dto));
    }

    @GetMapping
    public List<LivroRespostaDTO> listar() {
        return livroService.listar();
    }

    @GetMapping("/{id}")
    public LivroRespostaDTO buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public LivroRespostaDTO atualizar(@PathVariable Long id, @RequestBody @Valid LivroDTO dto) {
        return livroService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        livroService.remover(id);
        return ResponseEntity.noContent().build();
    }
}

