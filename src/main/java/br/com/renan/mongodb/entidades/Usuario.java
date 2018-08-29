/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.entidades;

import br.com.renan.mongodb.enuns.TipoUsuario;
import java.io.Serializable;
import org.bson.types.ObjectId;

/**
 *
 * @author Renan
 */
public class Usuario extends Pessoa implements Serializable {

    private ObjectId _id;

    private TipoUsuario tipoUsuario;

    private String cpfCnpjEmpresaAdministradora;

    private String login;

    private String senha;

    private boolean ativo = true;

    public Usuario() {

    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isAdministrador() { //ENCAPSULADO PARA FACILITAR
        return tipoUsuario == TipoUsuario.USUARIO_ADMINISTRADOR;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getCpfCnpjEmpresaAdministradora() {
        return cpfCnpjEmpresaAdministradora;
    }

    public void setCpfCnpjEmpresaAdministradora(String cpfCnpjEmpresaAdministradora) {
        this.cpfCnpjEmpresaAdministradora = cpfCnpjEmpresaAdministradora;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
