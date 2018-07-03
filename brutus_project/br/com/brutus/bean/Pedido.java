/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author thiag
 */
@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valorTotal")
    private Double valorTotal;

    @Column(name = "dtPedido")
    @Temporal(TemporalType.DATE)
    private Date dtPedido;

    @Column(name = "formaPagamento")
    private String formaPagamento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Double valorTotal, Date dtPedido, String formaPagamento, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.dtPedido = dtPedido;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
    }


//    public List<Produto> getProdutos() {
//        return produtos;
//    }
//
//    public void setProdutos(List<Produto> produtos) {
//        this.produtos = produtos;
//    }
    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getId() {
        return id;
    }

//    public Double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(Double peso) {
//        this.peso = peso;
//    }
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

//    public Produto getProduto() {
//        return produto;
//    }
//
//    public void setProduto(Produto produto) {
//        this.produto = produto;
//    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
