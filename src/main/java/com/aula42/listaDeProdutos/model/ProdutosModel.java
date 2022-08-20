package com.aula42.listaDeProdutos.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "produtos")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 10, nullable = false)
    private BigDecimal valor;

    @Column(name = "porcentagem_desconto",length = 10, nullable = false)
    private BigDecimal descontoPorcentagem;

    @Column(name = "valor_do_desconto",length = 10, nullable = false)
    private BigDecimal valorDoDesconto;

    @Column(name = "valor_final",length = 10, nullable = false)
    private BigDecimal valorFinal;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;


    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;


}