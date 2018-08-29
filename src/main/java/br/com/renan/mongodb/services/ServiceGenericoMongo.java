/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.services;

import br.com.renan.mongodb.dao.IMongoDao;
import java.io.Serializable;

/**
 *
 * @author Renan
 * @param <Entidade>
 */
public interface ServiceGenericoMongo<Entidade> extends IMongoDao<Entidade>, Serializable {

}
