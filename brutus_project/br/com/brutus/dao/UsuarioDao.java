/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import br.com.brutus.bean.Usuario;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author thiag
 */
public interface UsuarioDao extends BaseDao{
    public List<Usuario> procurarPorLogin(String login);
}
