package com.aula.listadeFormaDePagamentos.model.Receber;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;

import java.math.BigDecimal;

public class CalcularEmDinheiro implements  ValorAReceber{
    @Override
    public BigDecimal calcular (RecebimentoModel recebimentoModel){
        return recebimentoModel.getValorAPagarReceber();

    }
}
