/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repeticao;

/**
 *
 * @author Dyogo
 */
public class Repeticao1 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            i ++;
            if (i == 5 || i == 6) {
                continue; // O comando continue interrompe a sequencia e volta para o teste logico novamente
            }
            if (i == 8) {
                break; // Acaba com a repeticao
            }
            System.out.println(i);
            
            
        }
    }
    
}
