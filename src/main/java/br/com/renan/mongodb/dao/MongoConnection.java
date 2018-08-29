/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.dao;

/**
 *
 * @author Renan
 */
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {

    private static final String HOST = "localhost";
    private static final int PORT = 27017;
    private static final String DB_NAME = "base-mongodb";

    private static MongoConnection uniqInstance;
    private static int mongoInstance = 1;

    private MongoClient mongoClient;
    private MongoDatabase db;

    private MongoConnection() {
        //construtor privado
    }

    //garante sempre uma única instância da classe
    public static synchronized MongoConnection getInstance() {
        if (uniqInstance == null) {
            uniqInstance = new MongoConnection();
        }
        return uniqInstance;
    }

    //garante a existência de um único objeto mongo
    public MongoDatabase getDB() {
        if (mongoClient == null) {
            mongoClient = new MongoClient(HOST, PORT);
            db = mongoClient.getDatabase(DB_NAME);
        }
        return db;
    }
}
