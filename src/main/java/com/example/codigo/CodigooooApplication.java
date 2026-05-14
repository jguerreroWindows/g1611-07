package com.example.codigo;

import com.example.codigo.reto1.Desarrollador;
import com.example.codigo.reto1.Empleado;
import com.example.codigo.reto1.Gerente;
import com.example.codigo.reto2.Factura;
import com.example.codigo.reto2.Nomina;
import com.example.codigo.reto2.Pagable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodigooooApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodigooooApplication.class, args);
        System.out.println("Termino..!!");
        System.out.println("****************************EJERCICIO1*****************************");
        Empleado ger= new Gerente("Ivoonnee",3000, 500);
        Empleado des= new Desarrollador("Jose", 2500,300);

        System.out.println(ger);
        System.out.println(des);

        System.out.println("*****************************FIN*******************************");
        System.out.println("*****************************EJERCICIO2*******************************");
        Pagable factura = new Factura(1500.00, "F001-123", 270.00);
        Pagable nomina = new Nomina(500.00, "Nike Rodriguez"   ,2500.00);

        System.out.println( "Total de la Factura : S/. " + factura.calcularTota());
        System.out.println( "Total de la Nomina : S/. " + nomina.calcularTota());
        System.out.println("****************** FIN RETO 2 **********************");


    }

}
