package com.LearningJava._03_ManejoDeCadenas;

public class _02_ManejoDeIndices {
    public static void main(String[] args) {

        /*
            * Los indíces  de una cadena estan indexados  de una manera secuencial
            *  comenzamos desde 0  hasta el final de la cadena  menos 1, es decir  siempre la primera posicion es 0
            *
            * charAt()   obtiene el indice  qu enosotros le pasemos
        */
        System.out.println("******** Indices de cadenas *********");

        //Recuperamos Caracter con
        var cadena1 = "Hola Mundo";

        var primerCaracter = cadena1.charAt(0);
        char primerCaracter1 = cadena1.charAt(0);
        var ultimoCaracter = cadena1.charAt(9);

        System.out.println("Primer caracter desde un var: " + primerCaracter);
        System.out.println("Primer caracter desde un char: " + primerCaracter1);
        System.out.println("Ultimo caracter: " + ultimoCaracter);




    }
}
