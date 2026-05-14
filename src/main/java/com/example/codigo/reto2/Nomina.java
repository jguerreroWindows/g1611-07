package com.example.codigo.reto2;

public class Nomina implements Pagable{

    private String empleado;
    private double sueldoBase;
    private double bono;

    public Nomina(double bono, String empleado, double sueldoBase) {
        this.bono = bono;
        this.empleado = empleado;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularTota() {
        return sueldoBase+bono;
    }
}
