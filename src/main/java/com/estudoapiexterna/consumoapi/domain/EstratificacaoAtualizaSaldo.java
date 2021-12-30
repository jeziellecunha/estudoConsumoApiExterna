package com.estudoapiexterna.consumoapi.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class EstratificacaoAtualizaSaldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Integer idComposicaoFaixaEtaria;

    @Column
    private Integer idTipoAjusteSaldo;

    @Column
    private Integer idMotivoAjusteSaldo;

    @Column
    private Integer qtEstratificacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdComposicaoFaixaEtaria() {
        return idComposicaoFaixaEtaria;
    }

    public void setIdComposicaoFaixaEtaria(Integer idComposicaoFaixaEtaria) {
        this.idComposicaoFaixaEtaria = idComposicaoFaixaEtaria;
    }

    public Integer getIdTipoAjusteSaldo() {
        return idTipoAjusteSaldo;
    }

    public void setIdTipoAjusteSaldo(Integer idTipoAjusteSaldo) {
        this.idTipoAjusteSaldo = idTipoAjusteSaldo;
    }

    public Integer getIdMotivoAjusteSaldo() {
        return idMotivoAjusteSaldo;
    }

    public void setIdMotivoAjusteSaldo(Integer idMotivoAjusteSaldo) {
        this.idMotivoAjusteSaldo = idMotivoAjusteSaldo;
    }

    public Integer getQtEstratificacao() {
        return qtEstratificacao;
    }

    public void setQtEstratificacao(Integer qtEstratificacao) {
        this.qtEstratificacao = qtEstratificacao;
    }
}
