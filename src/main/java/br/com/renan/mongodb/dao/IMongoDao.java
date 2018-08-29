/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renan.mongodb.dao;

import br.com.renan.mongodb.exceptions.MongoDBException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Interface de operações com o banco mongodb
 *
 * @author Renan
 * @param <Entidade>
 */
public interface IMongoDao<Entidade> extends Serializable {

    /**
     * RETORNA TODOS OBJETOS DA ENTIDADE
     *
     * @return
     */
    List<Entidade> findAll();

    /**
     * RETORNA A BUSCA PAGINADA CONFORME:
     *
     * @param pagina - Pagina Atual
     * @param tamanho - Quantidade por página
     * @param ultimaEntidade Retorna a partir da ultima entidade passada
     * @param filtrosOperadorAND - Filtros AND
     * @param filtrosOperadorOR - Filtros OR (Faltando implementação)
     * @param sortField - Campo para ordenação(default _id)
     * @param ascendingOrder - Tipo de ordenação (true: asc, false: desc)
     * @return
     */
    public List<Entidade> buscaPaginada(int pagina, int tamanho, Entidade ultimaEntidade, Map<String, Object> filtrosOperadorAND, Map<String, Object[]> filtrosOperadorOR,
            String sortField, boolean ascendingOrder);

    /**
     * QUANTIDADES DE OBJETOS BASEADO NOS FILTROS. Usado para paginação
     *
     * @param filtrosOperadorAND
     * @param filtrosOperadorOR
     * @return
     */
    int countLinhas(Map<String, Object> filtrosOperadorAND, Map<String, Object[]> filtrosOperadorOR);

    /**
     * Persiste a entidade na base
     *
     * @param entidade
     * @throws br.com.renan.mongodb.exceptions.MongoDBException
     */
    public void onSalvar(Entidade entidade) throws MongoDBException;

    /**
     * Atualiza a entidade na base (Necessário _id preenchido)
     *
     * @param entidade
     * @throws br.com.renan.mongodb.exceptions.MongoDBException
     */
    public void onAtualizar(Entidade entidade) throws MongoDBException;

    /**
     * Exclui entidade da base (Necessário _id preenchido)
     *
     * @param entidade
     * @throws br.com.renan.mongodb.exceptions.MongoDBException
     */
    public void onExcluir(Entidade entidade) throws MongoDBException;

    /**
     * Retorna o primeiro registro encontrado
     *
     * @param filtrosOperadorAND - Filtros AND
     * @param filtrosOperadorOR - Filtros OR (Faltando implementação)
     * @return 
     */
    public Entidade buscaUnica(Map<String, Object> filtrosOperadorAND, Map<String, Object[]> filtrosOperadorOR);

}
