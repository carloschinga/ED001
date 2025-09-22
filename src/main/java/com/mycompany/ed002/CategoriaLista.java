/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed002;

import java.util.ArrayList;
import java.util.List;

public class CategoriaLista {
    List<Categoria> lista= new ArrayList<>();
    
    public CategoriaLista(){
        Categoria c1= new Categoria(1,"Cereales");
        Categoria c2= new Categoria(2,"Cervezas");
        lista.add(c1);
        lista.add(c2);
    }
}
