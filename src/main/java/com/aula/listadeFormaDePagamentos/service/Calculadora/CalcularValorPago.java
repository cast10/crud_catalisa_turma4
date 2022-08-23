package com.aula.listadeFormaDePagamentos.service.Calculadora;

import com.aula.listadeFormaDePagamentos.model.PagamentosModel;

import java.math.BigDecimal;

public interface CalcularValorPago {

    BigDecimal calcular(PagamentosModel pagamentosModel);
}
