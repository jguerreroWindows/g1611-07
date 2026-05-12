package com.example.codigo.Entity;

public abstract class Empleado {

    protected String nombre;
    protected double Sueldobase;

    public Empleado(String nombre, double sueldobase) {
        this.nombre = nombre;
        Sueldobase = sueldobase;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldobase() {
        return Sueldobase;
    }

    public void setSueldobase(double sueldobase) {
        Sueldobase = sueldobase;
    }

    public abstract double calcularBono();

    public double sueldoTotal(){
        return sueldoTotal() + calcularBono();
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", Sueldobase=" + Sueldobase +
                '}';
    }
}
