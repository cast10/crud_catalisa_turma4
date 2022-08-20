package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.PagamentosModel;
import com.aula42.listaDeProdutos.model.ProdutosModel;
import com.aula42.listaDeProdutos.model.valoresProdutos.CalculoDesconto;
import com.aula42.listaDeProdutos.service.PagamentosService;
import com.aula42.listaDeProdutos.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentosController {

    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping(path = "/pagamento")
    public List<PagamentosModel> buscarTodosPagamento(){
        return pagamentosService.buscarTodos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<PagamentosModel> buscarPagamentoPorId(@PathVariable Long codigo){
        return pagamentosService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentosModel cadastrarPagamento(@RequestBody ProdutosModel produtosModel, CalculoDesconto calculoDesconto){
        return pagamentosService.cadastrar(produtosModel, calculoDesconto);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentosModel alterarPagamento(@RequestBody ProdutosModel produtos){
        return pagamentosService.alterar(produtos);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamentos(@PathVariable Long codigo){
        pagamentosService.deletar(codigo);
    }
}
