package com.aula.listadeFormaDePagamentos.service;

import com.aula.listadeFormaDePagamentos.model.PagamentosModel;
import com.aula.listadeFormaDePagamentos.repository.PagamentosRepository;
import com.aula.listadeFormaDePagamentos.service.Calculadora.CalculaValorPagarFactory;
import com.aula.listadeFormaDePagamentos.service.Calculadora.CalcularValorPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentosService {

    @Autowired
    private PagamentosRepository pagamentosRepository;

    @Autowired
    private CalculaValorPagarFactory calculaValorPagarFactory;

    public List<PagamentosModel> buscarTodos() {
        return pagamentosRepository.findAll();
    }

    public Optional<PagamentosModel> buscarId(Long codigo) {
        return pagamentosRepository.findById(codigo);
    }

    public PagamentosModel cadastrar(PagamentosModel pagamentoModel) {
        CalcularValorPago calcularValorPago = calculaValorPagarFactory.getCalcularValorPago(pagamentoModel.getStatus());
        pagamentoModel.setValorAPagar(calcularValorPago.calcular(pagamentoModel));
        return pagamentosRepository.save(pagamentoModel);

        //pagamentoModel.getCodigo();
        //pagamentoModel.getDiferencaValor();
        //pagamentoModel.getValorAPagar();

    }

    public PagamentosModel alterar(PagamentosModel pagamentoModel) {
        CalcularValorPago calcularValorPago = calculaValorPagarFactory.getCalcularValorPago(pagamentoModel.getStatus());
        pagamentoModel.setValorAPagar(calcularValorPago.calcular(pagamentoModel));
        return pagamentosRepository.save(pagamentoModel);

        /// pagamentoModel.getCodigo();
        /// pagamentoModel.getDiferencaValor();
        /// pagamentoModel.getValorAPagar();


    }

    public void deletar(Long codigo) {
        pagamentosRepository.deleteById(codigo);
    }

}
