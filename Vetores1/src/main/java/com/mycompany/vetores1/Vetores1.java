/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores1;

import java.util.Arrays;

/**
 *
 * @author Dyogo
 */
public class Vetores1 {
    public static void main(String[] args) {
       // int n[] = new int [4];
       int n[] = {1, 5, 9, 4}; // int[] n 
        for (int i = 0; i < n.length; i++) {
            System.out.println("Valor: " + n[i]);
        }
        
        String mes[] = {"Jan","Fev", "Mar", "Abr", "Mai", "Jun", "Jul", 
        "Ago", "Set", "Out", "Nov", "Dez"};
        int fim[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " tem " + fim[i] + " dias");
        }
        
        for(int valor: n){
            System.out.println("Este eh o valor: " + valor);
        }
        
       Arrays.sort(n); // Ordena o vetor
       int pos = Arrays.binarySearch(n, 9); // Procura um valor dentro do vetor
       System.out.println("9 esta na posicao " + pos);
       int teste[] = new int[5];
       Arrays.fill(teste, 8); // Preenche automaticamente todas as posicoes do vetor
       for(int mostra:teste){
           System.out.println(mostra);
       }
       
        
    }
}
