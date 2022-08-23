package com.aula.listadeFormaDePagamentos.controller;

import com.aula.listadeFormaDePagamentos.model.PagamentosModel;
import com.aula.listadeFormaDePagamentos.service.PagamentosService;
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
    public List<PagamentosModel> buscarTodosPagamento() {
        return pagamentosService.buscarTodos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<PagamentosModel> buscarPagamentoPorId(@PathVariable Long codigo) {
        return pagamentosService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentosModel cadastrarPagamento(@RequestBody PagamentosModel pagamentosModel) {
        return pagamentosService.cadastrar(pagamentosModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentosModel alterarPagamento(@RequestBody PagamentosModel pagamentosModel) {
        return pagamentosService.alterar(pagamentosModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamentos(@PathVariable Long codigo) {
        pagamentosService.deletar(codigo);
    }
}
