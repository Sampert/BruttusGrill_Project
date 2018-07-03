/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.Cliente;
import br.com.brutus.bean.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author thiag
 */
public class ClienteDaoImpl extends BaseDaoAbstractImpl implements ClienteDao {

    public ClienteDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Cliente> pesquisarTodosClientes() {
        Query query = this.em.createQuery("SELECT c FROM Cliente c");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    public List<Cliente> pesquisarPorNome(String nome) {
        TypedQuery<Cliente> query = this.em.createQuery("SELECT c FROM Cliente c WHERE c.nome = :nome",Cliente.class);
        query.setParameter("nome", nome);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }
    
    @Override
    public List<Cliente> pesquisarPorCpf(String cpf) {
        TypedQuery<Cliente> query = this.em.createQuery("SELECT c FROM Cliente c WHERE c.cpf = :cpf",Cliente.class);
        query.setParameter("cpf", cpf);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

}
