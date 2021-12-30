package com.estudoapiexterna.consumoapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Table
@Entity
public class AtualizacaoSaldoDetalhado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Integer idAtualizacaoSaldo;

    @Column
    private  Integer nrUnidadeExploracao;

    @Column
    private String cdOficial;

    @OneToOne(cascade= CascadeType.PERSIST)

    private Pessoa pessoaTitular;

    @Column
    private String nmLocalidade;

    @Column
    private String nmMunicipio;

    @Column
    private String sgUF;

    @Column
    private String nmPessoaResponsavel;

    @OneToMany(cascade= CascadeType.PERSIST)
    @Column
    private List<EstratificacaoAtualizaSaldo> estratificacao;
}
