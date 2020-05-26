/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.switchcase;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Digite um numero de pernas: ");
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        switch(pernas){
            case 1: 
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bipede");
                break;
            case 3: 
                System.out.println("Tripe");
                break;
            case 4: 
                System.out.println("Quadrupede");
                break;
            case 6:
            case 8:
                System.out.println("Aranha");
                break;
            default: 
                System.out.println("ET");
                break;
        }
    }
    
}
