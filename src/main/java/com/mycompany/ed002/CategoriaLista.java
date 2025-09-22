/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed002;

import java.util.ArrayList;
import java.util.List;

public class CategoriaLista {

    List<Categoria> lista = new ArrayList<>();
    int apuntador = 0;
    public CategoriaLista() {
        Categoria c1 = new Categoria(1, "Cereales");
        Categoria c2 = new Categoria(2, "Cervezas");
        Categoria c3 = new Categoria(3, "Vinos");
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
    }
    public Categoria get() {
        return lista.get(apuntador);
    }
    public void primero() {
        apuntador = 0;
    }
    public void ultimo() {
        apuntador = lista.size() - 1;
    }
    public void siguiente() {
        if (apuntador < lista.size() - 1) {
            apuntador++;
        }
    }    
     public void anterior() {
        if (apuntador > 0) {
            apuntador--;
        }
    }
}
