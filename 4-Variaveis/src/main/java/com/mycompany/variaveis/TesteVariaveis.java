/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class TesteVariaveis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota: \n");
        float nota = teclado.nextFloat();
        
        System.out.println("Sua nota: " + nota);
        System.out.printf("%s sua nota: %.2f \n", nome, nota); // Formata para duas casas decimais
        System.out.format("%s sua nota: %.2f \n", nome, nota);
        
    }
 
}
