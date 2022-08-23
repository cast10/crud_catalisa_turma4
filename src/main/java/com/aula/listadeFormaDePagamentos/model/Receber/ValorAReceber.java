package com.aula.listadeFormaDePagamentos.model.Receber;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;

import java.math.BigDecimal;

public interface ValorAReceber {

    BigDecimal calcular (RecebimentoModel recebimentoModel);
}
