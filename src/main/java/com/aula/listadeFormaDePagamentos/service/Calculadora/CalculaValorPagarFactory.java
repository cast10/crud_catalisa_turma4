package com.aula.listadeFormaDePagamentos.service.Calculadora;

import org.springframework.stereotype.Component;

@Component
public class CalculaValorPagarFactory {


    public CalcularValorPago getCalcularValorPago(String statusPagamento) {
        if (statusPagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new CalculatPgtoAtraso();
        } else if (statusPagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new CalculaPgtoEmDia();
        } else {
            return null;
        }
    }

}
