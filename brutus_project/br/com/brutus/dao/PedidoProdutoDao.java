/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.PedidoProduto;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author thiag
 */
public interface PedidoProdutoDao extends BaseDao{
    List<PedidoProduto> procurarPorIdPedido(Integer id);
}
