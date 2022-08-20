package com.aula42.listaDeProdutos.model.Calculadora;

import com.aula42.listaDeProdutos.model.PagamentosModel;

import java.math.BigDecimal;

public class CalculaPgtoEmDia implements  CalcularValorPago{

    @Override
    public BigDecimal calcular (PagamentosModel pagamentosModel){

        return pagamentosModel.getValorAPagar().subtract(pagamentosModel.getDiferencaValor());
    }

}
