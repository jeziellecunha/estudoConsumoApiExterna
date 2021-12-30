package com.estudoapiexterna.consumoapi.resource;

import com.estudoapiexterna.consumoapi.domain.AtualizacaoSaldoDetalhado;
import com.estudoapiexterna.consumoapi.service.AtualizacaoSaldoAnimaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumoApi")
public class AtualizacaoSaldoResource {

    @Autowired
    AtualizacaoSaldoAnimaisService atualizacaoSaldoAnimaisService;

    @GetMapping
    public ResponseEntity<List<AtualizacaoSaldoDetalhado>> getAllSaldo(){
        List<AtualizacaoSaldoDetalhado> saldoList = this.atualizacaoSaldoAnimaisService.findAllAtualizacaoSaldo();
        return ResponseEntity.ok(saldoList);


    }
}
