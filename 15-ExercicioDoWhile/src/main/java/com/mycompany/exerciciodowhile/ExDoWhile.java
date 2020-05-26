/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciodowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Dyogo
 */
public class ExDoWhile {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Ola, Mundo!", "Louco", JOptionPane.WARNING_MESSAGE);
        int n, s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog
        (null, "<html> Informe um numero: <br> <em>(valor 0 interrompe)</em> </html>"));
        s += n;
        }while(n != 0);
        JOptionPane.showMessageDialog(null, 
                "<html> Resultado final: <br> ------------------ <br>  " +  
                        "Somatorio vale: " + s + " </html>");
    }
    
}
