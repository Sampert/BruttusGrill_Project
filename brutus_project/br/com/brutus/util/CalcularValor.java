/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.util;

/**
 *
 * @author thiag
 */
public class CalcularValor {

    public Double calcularValor(Double valor, Double peso) {
        Double valorTotal = valor * peso;
        return valorTotal;
    }
}
