/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.services.impl;

import br.com.renan.mongodb.dao.MongoDB;
import br.com.renan.mongodb.services.ServiceGenericoMongo;

/**
 * ENTIDADE GENERICA DE OPERAÇÕES COM O BANCO MONGODB
 *
 * @author Renan
 * @param <Entidade>
 */
public class ServiceGenericoMongoImpl<Entidade> extends MongoDB<Entidade> implements ServiceGenericoMongo<Entidade> {

    public ServiceGenericoMongoImpl(Class<Entidade> tipoGenerico) {
        super(tipoGenerico);
    }

}
