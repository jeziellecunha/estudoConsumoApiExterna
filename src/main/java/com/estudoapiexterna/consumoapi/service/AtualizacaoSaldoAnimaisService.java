package com.estudoapiexterna.consumoapi.service;

import com.estudoapiexterna.consumoapi.domain.AtualizacaoSaldoDetalhado;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "${api.secsantacatarina}", name = "atualizacaoSaldoAnimais")
public interface AtualizacaoSaldoAnimaisService {

    @GetMapping("/Pesquisar")
    List<AtualizacaoSaldoDetalhado> findAllAtualizacaoSaldo();
}
