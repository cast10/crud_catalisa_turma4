package com.aula.listadeFormaDePagamentos.controller;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;
import com.aula.listadeFormaDePagamentos.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {

    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping(path = "/produtos")
    public List<RecebimentoModel> buscarTodosRecebimento(@PathVariable Long codigo) {
        return recebimentoService.buscarTodosValores();
    }

    @GetMapping(path = "/Recebimento/{codigo}")
    public Optional<RecebimentoModel> buscarRecebimentoPorId(@PathVariable Long codigo) {
        return recebimentoService.buscarIdRecebimento(codigo);
    }

    @PostMapping(path = "/Recebimento")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel cadastrarRecebimento(@RequestBody RecebimentoModel recebimentoModel) {
        return recebimentoService.cadastrar(recebimentoModel);
    }

    @PutMapping(path = "/Recebimento/{codigo}")
    public RecebimentoModel alterarRecebimento(@RequestBody RecebimentoModel produtos) {
        return recebimentoService.alterar(produtos);
    }

    @DeleteMapping(path = "/Recebimento/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo) {
        recebimentoService.deletar(codigo);
    }
}
