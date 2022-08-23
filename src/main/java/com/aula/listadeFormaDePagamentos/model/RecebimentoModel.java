package com.aula.listadeFormaDePagamentos.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "Recebimento")
@NoArgsConstructor


public class RecebimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "valor_final", length = 10, nullable = false)
    private BigDecimal valorFinalReceber;

    @Column(length = 10, nullable = false)
    private BigDecimal valorTotalSemDesconto;


    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagarReceber;


}
