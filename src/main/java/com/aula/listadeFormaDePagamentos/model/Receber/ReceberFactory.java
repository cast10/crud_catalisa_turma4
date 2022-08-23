package com.aula.listadeFormaDePagamentos.model.Receber;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;

public class ReceberFactory {

    public ValorAReceber getValorAReceber(String pagamentoMetodo){
        if (pagamentoMetodo.equalsIgnoreCase("Pagamento em PIX ou Dinheiro")){
            return new CalcularEmDinheiro();
        }else if(pagamentoMetodo.equalsIgnoreCase("Pagamento no Cartão de Crédito")){
            return new CalcularCartaoCredito();
        }else if (pagamentoMetodo.equalsIgnoreCase("Pagamento no Vale Refeuçaõ")){
            return new CalcularCartaoRefeicao();
        }else if (pagamentoMetodo.equalsIgnoreCase("Pagamento no Cartão de Debito")){
            return new CalcularCartaoDebito();
        }else {return  null;}

    }
}
