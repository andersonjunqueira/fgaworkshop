package br.com.neotech.fgaworkshop.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    public static final int MAX_LENGTH_NOME = 100;
    public static final int MAX_LENGTH_LOGIN = 100;
    public static final int MAX_LENGTH_CPF = 11;
    public static final int MAX_LENGTH_RG = 30;
    public static final int MAX_LENGTH_ORGAO_EXPEDIDOR = 10;
    public static final int MAX_LENGTH_LOGRADOURO = 100;
    public static final int MAX_LENGTH_COMPLEMENTO = 20;
    public static final int MAX_LENGTH_NUMERO = 10;
    public static final int MAX_LENGTH_BAIRRO = 50;
    public static final int MAX_LENGTH_CIDADE = 50;
    public static final int MAX_LENGTH_CEP = 10;
    public static final int MAX_LENGTH_UF = 2;
    public static final int MAX_LENGTH_PAIS = 30;
    public static final int MAX_LENGTH_LANGUAGE = 10;
    public static final int MAX_LENGTH_TELEFONE = 15;
    public static final int MAX_LENGTH_EMAIL = 100;
    public static final int MAX_LENGTH_CURSO = 30;

    @Id
    @Column(name="ID_USUARIO")
    @SequenceGenerator(name="SEQ_USUARIO", sequenceName="SEQ_USUARIO", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_USUARIO")
    private Long id;

    @Column(name="NOME", length=MAX_LENGTH_NOME)
    private String nome;

    @Column(name="CPF", length=MAX_LENGTH_CPF)
    private String cpf;

    @Column(name="RG", length=MAX_LENGTH_RG)
    private String rg;

    @Column(name="ORGAO_EXPEDIDOR", length=MAX_LENGTH_ORGAO_EXPEDIDOR)
    private String orgaoExpedidor;

    @Column(name="UF_DOCUMENTO", length=MAX_LENGTH_UF)
    private String ufDocumento;

    @Column(name="CURSO", length=MAX_LENGTH_CURSO)
    private String curso;

    @Column(name="OUTRO_CURSO", length=MAX_LENGTH_CURSO)
    private String outroCurso;

    @Column(name="LOGRADOURO", length=MAX_LENGTH_LOGRADOURO)
    private String logradouro;

    @Column(name="COMPLEMENTO", length=MAX_LENGTH_COMPLEMENTO)
    private String complemento;

    @Column(name="NUMERO", length=MAX_LENGTH_NUMERO)
    private String numero;

    @Column(name="CEP", length=MAX_LENGTH_CEP)
    private String cep;

    @Column(name="BAIRRO", length=MAX_LENGTH_BAIRRO)
    private String bairro;

    @Column(name="CIDADE", length=MAX_LENGTH_CIDADE)
    private String cidade;

    @Column(name="UF", length=MAX_LENGTH_UF)
    private String uf;

    @Column(name="PAIS", length=MAX_LENGTH_PAIS)
    private String pais;

    @Column(name="TELEFONE", length=MAX_LENGTH_TELEFONE)
    private String telefone;

    @Column(name="EMAIL", unique=true, length=MAX_LENGTH_EMAIL)
    private String email;

    @Column(name="LOGIN", length=MAX_LENGTH_LOGIN)
    private String login;

    @Column(name="LANGUAGE", length=MAX_LENGTH_LANGUAGE)
    private String language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getUfDocumento() {
        return ufDocumento;
    }

    public void setUfDocumento(String ufDocumento) {
        this.ufDocumento = ufDocumento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getOutroCurso() {
        return outroCurso;
    }

    public void setOutroCurso(String outroCurso) {
        this.outroCurso = outroCurso;
    }

}
