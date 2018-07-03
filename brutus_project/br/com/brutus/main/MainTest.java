/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.main;

import br.com.brutus.bean.Cliente;
import br.com.brutus.bean.Endereco;
import br.com.brutus.bean.Produto;
import br.com.brutus.bean.Pedido;
import br.com.brutus.bean.PedidoProduto;
import br.com.brutus.bean.Usuario;
import br.com.brutus.dao.ClienteDaoImpl;
import br.com.brutus.dao.EnderecoDaoImpl;
import br.com.brutus.dao.PedidoDaoImpl;
import br.com.brutus.dao.PedidoProdutoDaoImpl;
import br.com.brutus.dao.ProdutoDaoImpl;
import br.com.brutus.dao.UsuarioDaoImpl;
import br.com.brutus.util.CalcularValor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.senac.dao.ConnectionFactory;

/**
 *
 * @author thiag
 */
public class MainTest {
    
//    public static void main(String[] args) {
//
//        EntityManager em = new ConnectionFactory().openConnection("BrutusGrillPU");
//        ClienteDaoImpl cdi = new ClienteDaoImpl(em);
//        PedidoDaoImpl pcdi = new PedidoDaoImpl(em);
//        ProdutoDaoImpl pdi = new ProdutoDaoImpl(em);
//        PedidoProdutoDaoImpl pedProd = new PedidoProdutoDaoImpl(em);
//        EnderecoDaoImpl edi = new EnderecoDaoImpl(em);
//        
//        Endereco endereco = new Endereco("Rua dos teste", "1", "Teste", "Teste", "TS", "Teste");
//        edi.save(endereco);
//        Cliente cliente = new Cliente("Thiago","000.000.000-00", "0000000000", "thiago@teste.com", endereco);
//        cdi.save(cliente);
//        
//        Produto produto = new Produto("Costela", 35.00);
//        Produto produto2 = new Produto("Frango", 25.00);
//        pdi.save(produto);
//        pdi.save(produto2);
//        
//        Pedido pedido = new Pedido();
//        
//        PedidoProduto pedPrd = new PedidoProduto(pedido, produto, 1.5, new CalcularValor().calcularValor(1.5, produto.getValor()));
//        PedidoProduto pedPrd2 = new PedidoProduto(pedido, produto2, 1.8, new CalcularValor().calcularValor(1.8, produto.getValor()));
//        
//        pedido.setCliente(cliente);
//        pedido.setDtPedido(new Date());
//        pedido.setFormaPagamento("A vista");
//        pedido.setValorTotal(pedPrd.getValor() + pedPrd2.getValor());
//        
//        pcdi.save(pedido);
//        pedProd.save(pedPrd);
//        pedProd.save(pedPrd2);
//        
//        
//        
//        
//    }
//        
//        Cliente cliente = (Cliente) cdi.searchById(Cliente.class, 8);
//        Produto produto = (Produto) pdi.searchById(Produto.class, 4);
//        
//        Double valorTotal = new CalcularValor().calcularValor(1.4, produto.getValor());
//        
//        Pedido pc = new Pedido();
//        pc.setCliente(cliente);
//        pc.setPeso(1.4);
//        pc.setValorTotal(valorTotal);
//        pc.setDtPedido(new Date());
//        pc.setFormaPagamento("A vista");
//        pc.setProduto(produto);
//        
//        pdi.save(pc);
//    }
//        
//        Usuario u = new Usuario("Teste", "teste", "teste");
//        udi.save(u);
//        
//        List<Usuario> usuarios = udi.procurarPorLogin();
//        for (int i = 0; i < usuarios.size(); i++) {
//            System.out.println(usuarios.get(i).getLogin());
//        }
//
//        Endereco endereco = new Endereco("Rua dos testes", "1", "Teste", "Testes", "TS", "Teste");
//        Produto produto = new Produto("Costela", 35.00);
//        Cliente cliente = new Cliente("Thiago", "984140510", "teste@email.com", endereco);
//
//        
//

//        ClienteDaoImpl cdi = new ClienteDaoImpl(em);
//        EnderecoDaoImpl edi = new EnderecoDaoImpl(em);
//        
//
//        edi.save(endereco);
//        pdi.save(produto);
//        cdi.save(cliente);
//        pcdi.save(pc);
//        List<Object[]> pedidos = pcdi.pesquisarTodosPedidos();
//
//        for (Object[] pedido : pedidos) {
//            Pedido pc2 = (Pedido) pedido[0];
//            Cliente c = (Cliente) pedido[1];
//            Produto p = (Produto) pedido[2];
//            
//            System.out.println("Numero Pedido: " + pc2.getId()
//                    + " Nome: " + c.getNome()
//                    + " Valor: " + pc2.getValorTotal()
//                    + "Produto: " + p.getNome());
//        }
}
