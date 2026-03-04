package com.example.cinema.service;

import com.example.cinema.entity.Filme;
import com.example.cinema.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public Filme salvar(Filme filme){
        return repository.save(filme);
        //Retorna a função save que está dentro do repository que vem através do extends do jpaRepository
    }

    public List<Filme> listarFilmes(){
        return repository.findAll();
        //Retorna a função findAll que está dentro do repository que vem através do extends do jpaRepository
    }

    public Filme buscarPorId(Long id) {
        return  repository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));
        //Retorna a função findById quesestá dentro do repotory que vem através do extends do jpaRepository
    }

    public Filme atualizar(Long id, Filme filmeAtualizado){
        Filme filme = repository.findById(id).orElseThrow(()-> new RuntimeException("Filme não encontrado"));

        filme.setTitulo(filmeAtualizado.getTitulo());
        filme.setDiretor(filmeAtualizado.getDiretor());
        filme.setGenero(filmeAtualizado.getGenero());
        filme.setAno(filmeAtualizado.getAno());
        filme.setNota(filmeAtualizado.getNota());

        return repository.save(filme);

    }

    public void deletar(Long id){
        Filme filme = repository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));
        repository.delete(filme);
    }


}

