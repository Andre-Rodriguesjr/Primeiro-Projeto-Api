package com.example.cinema.controller;

import com.example.cinema.entity.Filme;
import com.example.cinema.service.FilmeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/filmes")
public class FilmeController{
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        return filmeService.salvar(filme);
    }

    @GetMapping
    public List<Filme> listar(){
        return filmeService.listarFilmes();
    }

    @GetMapping("/{id}")
    public Filme buscar(@PathVariable Long id){
        return filmeService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Long id, @RequestBody Filme filme){
        return filmeService.atualizar(id, filme);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        filmeService.deletar(id);
    }

}
