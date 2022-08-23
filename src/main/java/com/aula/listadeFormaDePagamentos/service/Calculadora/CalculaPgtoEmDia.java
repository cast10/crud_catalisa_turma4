package com.aula.listadeFormaDePagamentos.service.Calculadora;

import com.aula.listadeFormaDePagamentos.model.PagamentosModel;

import java.math.BigDecimal;

public class CalculaPgtoEmDia implements CalcularValorPago {

    @Override
    public BigDecimal calcular(PagamentosModel pagamentosModel) {
        return pagamentosModel.getValorAPagar().subtract(pagamentosModel.getDiferencaValor());
    }

}
