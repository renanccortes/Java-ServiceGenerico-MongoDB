/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.entidades;

import br.com.renan.mongodb.enuns.TipoSexo;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public abstract class Pessoa implements Serializable {

    private Long idPessoa;

    private String nome;

    private String cpf;

    private Date dataNascimento;

    private String identidade;

    private String sexo;

    private String cel;

    private String celParticular;

    private String tel;

    private String telObs;

    private String email;

    private String email2;

    private String pathFoto;

    private String matricula;

    private String observacoes;

    private boolean recebeInfoPorEmail = false;

    private Endereco endereco;

    private TipoSexo tipoSexo;

    private String cpfAntigo;

    private boolean edicao = false;

    private Date dataCadastro;

    public Pessoa() {
        endereco = new Endereco();

    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        if (endereco == null) {
            endereco = new Endereco();
        }
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getSexo() {
        if (sexo == null || sexo.equals("")) {
            return "";
        }

        if (sexo.equals("M")) {
            return "Masculino";
        } else {
            return "Feminino";
        }

    }

    public void setSexo(String sexo) {
        if (sexo == null) {
            return;
        }
        if (sexo.length() != 1) {
            if (sexo.equalsIgnoreCase("MASCULINO")) {
                sexo = "M";
            } else {
                sexo = "F";
            }
        }
        this.sexo = sexo;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idPessoa);
        hash = 53 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (Objects.equals(this.idPessoa, other.idPessoa)) {
            return true;
        }
        if (Objects.equals(this.cpf, other.cpf)) {
            return true;
        }
        return false;
    }

    public TipoSexo getTipoSexo() {
        if (tipoSexo == null) {
            tipoSexo = TipoSexo.MASCULINO;
        }
        return tipoSexo;
    }

    public void setTipoSexo(TipoSexo tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public String getCelParticular() {
        return celParticular;
    }

    public void setCelParticular(String celParticular) {
        this.celParticular = celParticular;
    }

    public boolean isRecebeInfoPorEmail() {
        return recebeInfoPorEmail;
    }

    public void setRecebeInfoPorEmail(boolean recebeInfoPorEmail) {
        this.recebeInfoPorEmail = recebeInfoPorEmail;
    }

    public boolean isEdicao() {
        return edicao;
    }

    public void setEdicao(boolean edicao) {
        this.edicao = edicao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getCpfAntigo() {
        return cpfAntigo;
    }

    public void setCpfAntigo(String cpfAntigo) {
        this.cpfAntigo = cpfAntigo;
    }

    public String getTelObs() {
        return telObs;
    }

    public void setTelObs(String telObs) {
        this.telObs = telObs;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
