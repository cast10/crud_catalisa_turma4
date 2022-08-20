package com.aula42.listaDeProdutos.model.Calculadora;

import com.aula42.listaDeProdutos.model.PagamentosModel;
import com.aula42.listaDeProdutos.model.ProdutosModel;

import java.math.BigDecimal;

public interface CalcularValorPago {

    BigDecimal calcular (PagamentosModel pagamentosModel);
}
