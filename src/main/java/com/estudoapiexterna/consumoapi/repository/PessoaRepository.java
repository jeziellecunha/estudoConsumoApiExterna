package com.estudoapiexterna.consumoapi.repository;

import com.estudoapiexterna.consumoapi.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
