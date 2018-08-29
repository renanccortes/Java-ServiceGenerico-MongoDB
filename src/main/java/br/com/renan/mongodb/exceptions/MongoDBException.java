/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.exceptions;

/**
 *
 * @author Renan
 */
public class MongoDBException extends Exception {

    public MongoDBException(String message) {
        super(message);
    }

}
