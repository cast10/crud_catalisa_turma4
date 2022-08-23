package com.aula.listadeFormaDePagamentos.model;

import javax.persistence.Table;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "pagameento")
@NoArgsConstructor

public class PagamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "valor_final", length = 10, nullable = false)
    private BigDecimal valorFinal;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;

}
