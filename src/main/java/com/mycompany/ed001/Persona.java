
package com.mycompany.ed001;


public class Persona {
    private int codigo;
    private String nombre;
    private double monto;

    public Persona(int codigo, String nombre, double monto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.monto = monto;
    }

    public Persona() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
