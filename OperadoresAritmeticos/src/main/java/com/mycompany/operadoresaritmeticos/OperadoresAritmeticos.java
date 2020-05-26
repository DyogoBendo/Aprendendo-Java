/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author Dyogo
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media eh igual a: " + m);
        
        int numero = 5;
        numero ++; // Operador unario
        System.out.println("Numero ++: "+  numero);
        
        int x = 4;
        x += 8;
        System.out.println(x);
        
        double raiz = Math.sqrt(4);  
        System.out.println(raiz);
        
        float y = 8.4f;
        int baixo = (int) Math.floor(y);
        int cima = (int) Math.ceil(y);
        int meio = (int) Math.round(y);
        System.out.println(baixo);
        System.out.println(cima);
        System.out.println(meio);
        
        double ale = Math.random(); // Valores entre 0 e 1
        System.out.println(ale); 
        
        int aleatorio = (int) (10 + ale * (100 - 10)); //Valores entre 10 e 100
        System.out.println(aleatorio);
    }
}
