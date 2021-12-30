package com.estudoapiexterna.consumoapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Table
@Entity
public class IncluirAtualizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Date dtOcorrencia;

    @Column
    private String cdOficial;

    @Column
    private Integer nrUnidadeExploracao;

    @OneToMany(cascade= CascadeType.PERSIST)
    @Column
    private List<EstratificacaoAtualizaSaldo> estratificacao;

    @Column
    private String dsObservacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtOcorrencia() {
        return dtOcorrencia;
    }

    public void setDtOcorrencia(Date dtOcorrencia) {
        this.dtOcorrencia = dtOcorrencia;
    }

    public String getCdOficial() {
        return cdOficial;
    }

    public void setCdOficial(String cdOficial) {
        this.cdOficial = cdOficial;
    }

    public Integer getNrUnidadeExploracao() {
        return nrUnidadeExploracao;
    }

    public void setNrUnidadeExploracao(Integer nrUnidadeExploracao) {
        this.nrUnidadeExploracao = nrUnidadeExploracao;
    }

    public List<EstratificacaoAtualizaSaldo> getEstratificacao() {
        return estratificacao;
    }

    public void setEstratificacao(List<EstratificacaoAtualizaSaldo> estratificacao) {
        this.estratificacao = estratificacao;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }
}
