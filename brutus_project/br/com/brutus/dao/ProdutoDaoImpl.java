/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author thiag
 */
public class ProdutoDaoImpl extends BaseDaoAbstractImpl implements ProdutoDao {

    public ProdutoDaoImpl(EntityManager em) {
        super(em);
    }

    public List<Produto> pesquisarTodosProdutos() {
        Query query = this.em.createQuery("SELECT p FROM Produto p");
        List<Produto> produtos = query.getResultList();
        return produtos;
    }

}
