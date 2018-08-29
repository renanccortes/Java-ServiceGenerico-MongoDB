package br.com.renan.mongodb.entidades;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Endereco
 *
 */
public class Endereco implements Serializable {

    private String desLogradouro;

    private String desNumero;

    private String desComplemento;

    private String desBairro;

    private String desCep;

    private String cidade;

    private String uf;

    public Endereco() {
        super();
    }

    public Endereco(String desLogradouro, String desNumero, String desComplemento, String desBairro, String desCep, String cidade, String estado) {
        super();
        this.desLogradouro = desLogradouro;
        this.desNumero = desNumero;
        this.desComplemento = desComplemento;
        this.desBairro = desBairro;
        this.desCep = desCep;
        this.cidade = cidade;
        this.uf = estado;

    }

    public String getDesLogradouro() {
        return desLogradouro;
    }

    public void setDesLogradouro(String desLogradouro) {
        this.desLogradouro = desLogradouro;
    }

    public String getDesNumero() {
        return desNumero;
    }

    public void setDesNumero(String desNumero) {
        this.desNumero = desNumero;
    }

    public String getDesComplemento() {
        return desComplemento;
    }

    public void setDesComplemento(String desComplemento) {
        this.desComplemento = desComplemento;
    }

    public String getDesBairro() {
        return desBairro;
    }

    public void setDesBairro(String desBairro) {
        this.desBairro = desBairro;
    }

    public void setDesCep(String desCep) {
        this.desCep = desCep;
    }

    public String getCidade() {

        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        String enderecoQualificado = desLogradouro + ", " + desNumero + " - " + desBairro + " - CEP: " + desCep + " - " + cidade + "-" + uf;
        return enderecoQualificado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
