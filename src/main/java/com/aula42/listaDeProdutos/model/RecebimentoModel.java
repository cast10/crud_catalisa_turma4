package com.aula42.listaDeProdutos.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;



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

    @Column(name = "valor_final",length = 10, nullable = false)
    private BigDecimal valorFinalReceber;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValorReceber;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagarReceber;


}
