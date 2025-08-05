package br.com.techlead.livros_api.service;

import br.com.techlead.livros_api.dto.LivroDTO;
import br.com.techlead.livros_api.dto.LivroRespostaDTO;
import br.com.techlead.livros_api.entidade.Livro;
import br.com.techlead.livros_api.repository.LivroRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;
    private final ModelMapper modelMapper;

    public LivroRespostaDTO salvar(LivroDTO dto) {
        Livro livro = new Livro();
        dtoParalivro(dto, livro);

        return modelMapper.map(livroRepository.save(livro), LivroRespostaDTO.class);
    }

    private static void dtoParalivro(LivroDTO dto, Livro livro) {
        livro.setTitulo(dto.getTitulo());
        livro.setIsbn(dto.getIsbn());
        livro.setPreco(dto.getPreco());
        livro.setDataPublicacao(dto.getDataPublicacao());
        livro.setAutorId(dto.getAutorId());
    }

    public List<LivroRespostaDTO> listar() {
        return livroRepository.findAll()
                .stream()
                .map(livro -> modelMapper.map(livro, LivroRespostaDTO.class))
                .toList();
    }

    public LivroRespostaDTO buscarPorId(Long id) {
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));
        return modelMapper.map(livro, LivroRespostaDTO.class);
    }

    public LivroRespostaDTO atualizar(Long id, LivroDTO dto) {
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));

        dtoParalivro(dto, livro);

        return modelMapper.map(livroRepository.save(livro), LivroRespostaDTO.class);
    }

    public void remover(Long id) {
        livroRepository.deleteById(id);
    }
}

