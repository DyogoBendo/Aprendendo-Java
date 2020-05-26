/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estruturacondicao;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class EstruraCondicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nota 1: ");
        float n1 = teclado.nextFloat();
        
        System.out.println("Nota 2: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1 + n2) / 2;
        System.out.println("Sua media foi: " + media);
        
        if (media > 9) {
            System.out.println("Parabens");
            
        } else{
            System.out.println("Se esforce mais!");
        }
        
        
    }
    
}
