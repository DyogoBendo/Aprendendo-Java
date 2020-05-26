/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dowhile2;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja digitar outro numero?[S/N] ");
            resposta = teclado.next();
        } while(resposta.equals("S"));
        System.out.println("Soma de todos os valores: " + s);
    }
 
}
