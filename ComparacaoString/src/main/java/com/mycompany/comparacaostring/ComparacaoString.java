/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparacaostring;

/**
 *
 * @author Dyogo
 */
public class ComparacaoString {
    public static void main(String[] args) {
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo"); // Diferente dos outros, por ter sido instanciado usando a clausula new
        String res;
        res = n3==n2?"igual":"diferente";
        System.out.println(res);
        res = n2.equals(n3)?"igual":"diferente"; // Verifica se o conteudo de um objeto eh igual ao do outro, para objetos, usamos equal, e nao ==
        System.out.println(res);
    }
    }
// E - && 
// Ou - ||
// Xor, ou exclusivo - ^
// Not - !
    

