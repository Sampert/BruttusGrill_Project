/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.PedidoProduto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author thiag
 */
public class PedidoProdutoDaoImpl extends BaseDaoAbstractImpl implements PedidoProdutoDao {

    public PedidoProdutoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<PedidoProduto> procurarPorIdPedido(Integer id) {
        
        Query query = this.em.createQuery("SELECT p FROM pedido_produto p WHERE p.pedido.id = :id");
        query.setParameter("id", id);
        List<PedidoProduto> pedidos = query.getResultList();
        return pedidos;
    }

}
