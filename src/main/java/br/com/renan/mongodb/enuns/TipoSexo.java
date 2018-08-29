/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.enuns;

/**
 *
 * @author Renan Cortes
 */
public enum TipoSexo {

    MASCULINO,
    FEMININO;

    @Override
    public String toString() {
        if (this == MASCULINO) {
            return "MASCULINO";
        }

        if (this == FEMININO) {
            return "FEMININO";
        }

        return "";
    }

}
