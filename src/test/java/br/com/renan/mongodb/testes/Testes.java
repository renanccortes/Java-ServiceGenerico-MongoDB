/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.testes;

import br.com.renan.mongodb.entidades.Usuario;
import br.com.renan.mongodb.exceptions.MongoDBException;
import br.com.renan.mongodb.services.ServiceGenericoMongo;
import br.com.renan.mongodb.services.impl.ServiceGenericoMongoImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.types.ObjectId;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Renan
 */
//SEGUINDO A ORDEM ALFABETICA DOS METODOS
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes {

    private static final String CPF_TEST = "99999999999";
    private static final String NOME_TEST = "Test";
    private static final String LOGIN_TEST = "admin";
    private static final String SENHA_TEST = "admin";
    private static ObjectId idObjeto;

    ServiceGenericoMongo<Usuario> serviceUsuario;

    public Testes() {
        serviceUsuario = new ServiceGenericoMongoImpl(Usuario.class);
    }

    @Test //TESTANDO GRAVAÇÃO NO BANCO
    public void onTest1() throws MongoDBException {
        Usuario usuario = new Usuario();
        usuario.setNome(NOME_TEST);
        usuario.setCpf(CPF_TEST);
        usuario.setLogin(LOGIN_TEST);
        usuario.setSenha(SENHA_TEST);
        //Salvando no BD
        serviceUsuario.onSalvar(usuario);

    }

    @Test //TESTANDO CONSULTA NO BANCO
    public void onTest2() throws MongoDBException {
        //Consultando
        Map<String, Object> filtrosAnd = new HashMap<>();
        filtrosAnd.put("cpf", CPF_TEST);
        filtrosAnd.put("login", LOGIN_TEST);
        Usuario usuarioBanco = serviceUsuario.buscaUnica(filtrosAnd, null);
        idObjeto = usuarioBanco.getId();
        assertThat(usuarioBanco.getCpf(), is(CPF_TEST));
    }

    @Test //TESTANDO CONSULTA PAGINADA DO BANCO
    public void onTest3() throws MongoDBException {
        //Consultando
        Map<String, Object> filtrosAnd = new HashMap<>();
        filtrosAnd.put("cpf", CPF_TEST);
        List<Usuario> buscaPaginada = serviceUsuario.buscaPaginada(0, 10, null, filtrosAnd, null, null, false);
        int countLinhas = serviceUsuario.countLinhas(filtrosAnd, null);
        assertThat(buscaPaginada.size(), is(1));
        assertThat(countLinhas, is(1));
    }

    @Test //TESTANDO EXCLUSÃO NO BANCO
    public void onTest4() throws MongoDBException {
        Usuario usuario = new Usuario();
        //setando id para exclusão
        usuario.setId(idObjeto);
        //excluindo
        serviceUsuario.onExcluir(usuario);

    }
}
