/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Testando GitHub.
package sysvendas;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import view.Login;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author cesar.nascimento
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exemplos mudança estilo Nimbus
        //Só funciona com java 8
        /*UIManager.put( "nimbusBase", new Color( 81, 81, 81 ) );  
        UIManager.put( "nimbusBlueGrey", new Color( 190, 190, 190 ) );  
        UIManager.put( "control", new Color( 223, 223, 223 ) );*/ 
        try {  
            //Setar estilo que eu quero,ex: Trocar Nimbus por Windows,ou Metal no if
            for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {  
                if ( "Nimbus".equals( info.getName() ) ) {  
                    UIManager.setLookAndFeel( info.getClassName() );  
                    break;  
                }  
            }
        //ver os estilos que eu tenho instalado no projeto
        /*for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {  
            System.out.println( info.getName() );  
        }*/ 
        } catch(UnsupportedLookAndFeelException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException e){
            System.out.println("Não foi possível setar o estilo,contate o administrador");
        }
        Login l = new Login();
        l.setVisible(true);
    }
}
