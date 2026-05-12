package com.example.codigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodigooooApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodigooooApplication.class, args);
        System.out.println("Termino..!!");

        Empleado ger= new Gerente("Ivoonnee",3000, 500);
        Empleado des= new Desarrollador("Jose", 2500,300);

        System.out.println(ger);
        System.out.println(des);

        System.out.println("Termino..!!");



    }

}
