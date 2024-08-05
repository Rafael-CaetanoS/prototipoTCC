package com.teste.Exercicio.Controllers;

import com.teste.Exercicio.Modells.TipoServico;
import com.teste.Exercicio.Repository.RepositoryTipoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping(path = "/TipoServico")
public class TipoServicoController {
    @Autowired
    RepositoryTipoServico repository;

    @GetMapping
    public Iterable<TipoServico> retornaTipoServico(){
        return repository.findAll();
    }

    @GetMapping (path = "/{id}")
    public Optional<TipoServico> retornaTipoServicoPorID(@PathVariable int id){
        return repository.findById(id);
    }

    @PostMapping("/inserir")
    public TipoServico InserirTipoSerivco(TipoServico tipoServico){
        return repository.save(tipoServico);
    }

}
