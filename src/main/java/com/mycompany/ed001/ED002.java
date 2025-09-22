/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed001;


public class ED002 {
    Nodo raiz=null;
    public void agregar (int c){
        if (raiz==null) {
            raiz=new Nodo(c);    
        }
        else{ 
            Nodo p =raiz;
            while (p.getSig()!=null) {                
               p=p.getSig(); 
            }
            p.setSig(new Nodo(c));
        }
    }
    public void imprimir(){
        Nodo p=raiz;
        while(p!=null){
            System.out.println(p.getCodigo());
            p=p.getSig(); 
        }
    }
    
    
    public static void main(String[] args) {
        ED002 lista= new  ED002();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.imprimir();
        
    }
}
