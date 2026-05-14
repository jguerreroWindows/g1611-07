package com.example.codigo.reto2;

public class Factura implements Pagable{

    private String numeroFactura;
    private double subTotal;
    private double igv;

    public Factura(double subTotal, String numeroFactura, double igv) {
        this.subTotal = subTotal;
        this.numeroFactura = numeroFactura;
        this.igv = igv;
    }

    @Override
    public double calcularTota() {
        return subTotal+igv;
    }
}
