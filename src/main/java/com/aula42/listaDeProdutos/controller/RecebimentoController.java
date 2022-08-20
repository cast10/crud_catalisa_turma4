package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.ProdutosModel;
import com.aula42.listaDeProdutos.model.RecebimentoModel;
import com.aula42.listaDeProdutos.model.valoresProdutos.CalculoDesconto;
import com.aula42.listaDeProdutos.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {

    @Autowired
    private RecebimentoModel recebimentoService;

    @GetMapping(path = "/produtos")
    public List<RecebimentoModel> buscarTodosRecebimento(){
        return recebimentoService.buscarTodos();
    }

    @GetMapping(path = "/Recebimento/{codigo}")
    public Optional<RecebimentoModel> buscarRecebimentoPorId(@PathVariable Long codigo){
        return recebimentoService.buscarId(codigo);
    }

    @PostMapping(path = "/Recebimento")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutosModel cadastrarRecebimento(@RequestBody ProdutosModel produtosModel, CalculoDesconto calculoDesconto){
        return recebimentoService.cadastrar(produtosModel, calculoDesconto);
    }

    @PutMapping(path = "/Recebimento/{codigo}")
    public ProdutosModel alterarRecebimento(@RequestBody ProdutosModel produtos){
        return recebimentoService.alterar(produtos);
    }

    @DeleteMapping(path = "/Recebimento/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo){
        recebimentoService.deletar(codigo);
    }
}
