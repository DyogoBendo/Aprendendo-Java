 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodos;

/**
 *
 * @author Dyogo
 */
public class Metodos { // Metodo sao funcoes ou procedimentos dentro de classes
    // Procedimento nao tem retorno
    // Funcao tem retorno
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("Valor da soma: " + s);
    }
    
    static int sub(int a, int b){
        int s = a - b;
        return s;
    }
    
    public static void main(String[] args) {
        int t = 4, v = 5;
         soma(t, v);
         System.out.println("Valor da subtracao: " + sub(t, v));
         System.out.println("Valores: "+ t + " e " + v);
         
    }
}
