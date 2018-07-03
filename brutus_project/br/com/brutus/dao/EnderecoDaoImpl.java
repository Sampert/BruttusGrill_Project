/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import javax.persistence.EntityManager;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author thiag
 */
public class EnderecoDaoImpl extends BaseDaoAbstractImpl implements EnderecoDao {

    public EnderecoDaoImpl(EntityManager em) {
        super(em);
    }

}
