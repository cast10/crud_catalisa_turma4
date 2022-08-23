package com.aula.listadeFormaDePagamentos.service;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;
import com.aula.listadeFormaDePagamentos.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {

    @Autowired
    private RecebimentoRepository recebimentoRepository;

    @Autowired
    private RecebimentoRepository pagamentosRepository;

    public List<RecebimentoModel> buscarTodosValores() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarIdRecebimento(Long codigo) {
        return recebimentoRepository.findById(codigo);
    }

    public RecebimentoModel cadastrar(RecebimentoModel recebimentoModel) {

        CalcularValorAReceber calcularValorAReceber = valorAReceberFactory.getCalcularValorAReceber(recebimentoModel.getMetodoPgto());
        recebimentoModel.setValorFinalReceber(calcularValorAReceber.calcular(recebimentoModel));

        //recebimentoModel.getCodigo();
        //recebimentoModel.getValorFinalReceber();
        //recebimentoModel.getValorTotalSemDesconto();
        //recebimentoModel.getValorAPagarReceber();
        return recebimentoRepository.save(recebimentoModel);
    }

    public RecebimentoModel alterar(RecebimentoModel recebimentoModel) {
        CalcularValorAReceber calcularValorAReceber = valorAReceberFactory.getCalcularValorAReceber(recebimentoModel.getMetodoPgto());
        recebimentoModel.setValorFinalReceber(calcularValorAReceber.calcular(recebimentoModel));

        //recebimentoModel.getCodigo();
        //recebimentoModel.getValorFinalReceber();
        //recebimentoModel.getValorTotalSemDesconto();
        //recebimentoModel.getValorAPagarReceber();

        return pagamentosRepository.save(recebimentoModel);
    }

    public void deletar(Long codigo) {
        pagamentosRepository.deleteById(codigo);
    }


}

