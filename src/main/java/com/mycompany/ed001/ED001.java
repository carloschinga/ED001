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
        
        double sumatoria=0;
        double montomenor;
        double montomayor;
        
        for (int i = 0; i < 5; i++) {
            codigo[i]= (i+1);
            nombre[i]= JOptionPane.
                    showInputDialog("Ingrese nombre " + (i+1)+":");
            monto[i]=Double.parseDouble(
                    JOptionPane.
                            showInputDialog("Ingrese monto " + (i+1)+":")
                        );                    
        }
        montomenor=monto[0];
        montomayor=monto[0];
        for (int i = 0; i < 5; i++) {
            System.out.println(codigo[i] + " - "+ nombre[i] + " - " + monto[i]);
            sumatoria=sumatoria+monto[i];
            
            if(montomenor>monto[i]){
                montomenor=monto[i];
            }
            if(montomayor<monto[i]){
                montomayor=monto[i];
            }
        }    
        System.out.println("sumatoria: " + sumatoria);
        System.out.println("monto menor: " + montomenor);
        System.out.println("monto mayor: " + montomayor);
    }
}
