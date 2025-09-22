/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed001;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ED001 {

    public static void main(String[] args) {
        int[] codigo= new int[5];
        String[] nombre=new String[5];    
        double[] monto= new double[5];
        for (int i = 0; i < 5; i++) {
            codigo[i]= (i+1);
            nombre[i]= JOptionPane.
                    showInputDialog("Ingrese nombre " + (i+1)+":");
            monto[i]=Double.parseDouble(
                    JOptionPane.
                            showInputDialog("Ingrese monto " + (i+1)+":")
                        );                    
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(codigo[i] + " - "+ nombre[i] + " - " + monto[i]);            
        }        
    }
}
