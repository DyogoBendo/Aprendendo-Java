/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Dyogo
 */
public class DadosDoSistema {
    public static void main(String[] args) {
        Locale lingua = Locale.getDefault();
        Date relogio = new Date(); // criando um novo objeto
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("A hora do sistema eh: " + relogio.toString());
        System.out.println("A lingua do sistema: " + lingua.getDisplayLanguage());
        System.out.println("Tamanho da tela: " + d.width + "x" + d.height);
    }
    
}
