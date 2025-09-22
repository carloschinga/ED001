package com.mycompany.ed001;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ED004 {
        
    public static void main(String[] args) {
        List<Producto> listaProductos= new ArrayList<Producto>();
        int codigo; String nombre; double precio;  String categoria;
        
        for (int i = 0; i < 3; i++) {
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo"+ (i+1)));
            nombre=JOptionPane.showInputDialog("Ingrese nombre"+(i+1));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto"+ (i+1)));
            categoria=JOptionPane.showInputDialog("Ingrese categoria"+(i+1));
            
            Producto p= new Producto(codigo, nombre, precio, categoria);
            listaProductos.add(p);
        }
        
        for (int i = 0; i < 3; i++) {
            Producto p= listaProductos.get(i);
            System.out.println(p.getNombre()+"-"+ p.getPrecio());
        }
    }

}
