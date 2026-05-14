package com.example.codigo.reto1;

public abstract class Empleado {

    protected String nombre;
    protected double Sueldobase;

    public Empleado(String nombre, double sueldobase) {
        this.nombre = nombre;
        Sueldobase = sueldobase;
    }

    public abstract double  calcularBono();

    public double sueldoTotal(){
        return Sueldobase + calcularBono();
    }

    @Override
    public String toString() {
        return nombre + " -> total; $ " + sueldoTotal();
    }
}
