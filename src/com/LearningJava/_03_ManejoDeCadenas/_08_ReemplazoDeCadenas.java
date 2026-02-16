package com.LearningJava._03_ManejoDeCadenas;

public class _08_ReemplazoDeCadenas {
    public static void main(String[] args) {
        /*
            * Reemplazo de cadenas
            *
            * replace - Vamos  a hacer uso de el no solo para una solo caracter si no para una cadena
            *
            * Com oya sabemso las cadenas son inmutables  entonces siemrpe se creara un nuvo objeto y se movera añ otro
            *
        */

        var cadena = "Hola Mundo";


        var cadenaModificada = cadena.replace("Mundo" , "Colombia");
        var cadenaModificadaAModificar = cadenaModificada.replace("Hola" , "Saludos");


        System.out.println(cadena);
        System.out.println(cadenaModificada);
        System.out.println(cadenaModificadaAModificar);
    }
}
