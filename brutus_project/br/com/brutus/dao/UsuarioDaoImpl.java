/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

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
public class UsuarioDaoImpl extends BaseDaoAbstractImpl implements UsuarioDao {

    public UsuarioDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Usuario> procurarPorLogin(String login) {

        TypedQuery<Usuario> query = this.em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login",Usuario.class);
        query.setParameter("login", login);
        List<Usuario> usuarios = query.getResultList();
        return usuarios;

    }
}
