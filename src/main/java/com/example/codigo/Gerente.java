package com.example.codigo;

public class Gerente extends Empleado{

    private double bonoJefe;

    public Gerente(String nombre, double sueldobase, double bonoJefe) {
        super(nombre, sueldobase);
        this.bonoJefe = bonoJefe;
    }

    @Override
    public double calcularBono() {
        return bonoJefe;
    }
}
