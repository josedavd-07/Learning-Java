package com.LearningJava._03_ManejoDeCadenas;

public class _10_CaracteresEspeciales {
    public static void main(String[] args) {
        /*
            * Caracteres especiales
            *
            * \n     - Este no s genra un slato de línea en la cadena
            * \t     - Este nos genra una tabulacion en nuestras salidas
            * \'     - Este nos muestra una comilla simple
            * \"     - Este agrega una comilla doble
            * \\     - Este nos muestra la barra diaghonal innvertida, la primera corresponde a barra invertida
        */


        var cadena1 = "Hola\nMundo";
        var cadena2 = "Hola\tMundo";
        var cadena3 = "Hola \' Mundo";
        var cadena4 = "Hola \" Mundo";
        var cadena5 = "Hola \\ MUndo";


        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);
        System.out.println(cadena4);
        System.out.println(cadena5);


    }
}
