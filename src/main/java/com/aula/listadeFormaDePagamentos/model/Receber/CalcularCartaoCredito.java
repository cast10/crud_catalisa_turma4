package com.aula.listadeFormaDePagamentos.model.Receber;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;

import java.math.BigDecimal;

 public class CalcularCartaoCredito  implements  ValorAReceber{
    @Override
    public  BigDecimal calcular (RecebimentoModel recebimentoModel){
        BigDecimal taxas = recebimentoModel.getValorAPagarReceber().multiply(new BigDecimal("0.037"));
        return recebimentoModel.getValorAPagarReceber().subtract(taxas);

    }
 }

