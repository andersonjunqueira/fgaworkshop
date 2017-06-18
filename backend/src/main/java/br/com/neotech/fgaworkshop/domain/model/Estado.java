package br.com.neotech.fgaworkshop.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_UF")
public class Estado {

    public static final int MAX_LENGTH_SIGLA = 2;
    public static final int MAX_LENGTH_NOME = 30;

    @Id
    @Column(name="ID_UF")
    @GeneratedValue
    private Long id;

    @Column(name="SIGLA", length=MAX_LENGTH_SIGLA)
    private String sigla;

    @Column(name="NOME", length=MAX_LENGTH_NOME)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
