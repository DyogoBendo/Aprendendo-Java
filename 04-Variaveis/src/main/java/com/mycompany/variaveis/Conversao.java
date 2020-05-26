/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variaveis;

/**
 *
 * @author Dyogo
 */
public class Conversao {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade); // Converte de int para string
        
        String teste = "30";
        int velho = Integer.parseInt(teste); // Converte de string para int
    }
}
