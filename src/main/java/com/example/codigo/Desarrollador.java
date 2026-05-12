package com.example.codigo;

public class Desarrollador extends Empleado{

    private double bonoxProyecto;

    public Desarrollador(String nombre, double Sueldobase, double bonoxProyecto) {
        super(nombre, Sueldobase);
        this.bonoxProyecto = bonoxProyecto;
    }

    @Override
    public double calcularBono() {
        return (Sueldobase * 0.10)+ bonoxProyecto;
    }
}
