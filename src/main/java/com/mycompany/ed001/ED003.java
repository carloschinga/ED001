package com.mycompany.ed001;

import java.util.ArrayList;
import java.util.List;

public class ED003 {

    public static void main(String[] args) {
        
        double sumatoria=0;
        double montomenor;
        double montomayor;
        List<Persona> listaPersona = new ArrayList<>();
        Persona p1 = new Persona(1, "Carlos", 100);
        Persona p2 = new Persona(2, "Juan", 200);
        Persona p3 = new Persona(3, "Luis", 300);
        Persona p4 = new Persona(4, "Flor", 400);
        Persona p5 = new Persona(5, "Alberto", 500);
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);
        listaPersona.add(p4);
        listaPersona.add(p5);
        
        montomenor=p1.getMonto();
        montomayor=p5.getMonto();
        for (Persona persona : listaPersona) {
            System.out.println(persona.getCodigo() + " - "+  persona.getNombre() +  " - " +  persona.getMonto());
            sumatoria=sumatoria+persona.getMonto();
            
            if(montomenor>persona.getMonto()){
                montomenor=persona.getMonto();
            }
            
            if(montomayor<persona.getMonto()){
                montomayor=persona.getMonto();
            }            
        }
        
        System.out.println("La sumatoria es:" +  sumatoria);
        System.out.println("La monto mayor es:" +  montomayor);
        System.out.println("La monto menor es:" +  montomenor);
    }

}
