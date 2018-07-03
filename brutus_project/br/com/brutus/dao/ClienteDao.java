/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.Cliente;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author thiag
 */
public interface ClienteDao extends BaseDao{
    public List<Cliente> pesquisarTodosClientes();
    public List<Cliente> pesquisarPorNome(String nome);
    public List<Cliente> pesquisarPorCpf(String cpf);
}
