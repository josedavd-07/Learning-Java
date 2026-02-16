package com.LearningJava._03_ManejoDeCadenas;

public class _06_Subcadenas {
    public static void main(String[] args) {
        /*
            * Manejo de Subcadenas
            *
            * substring()   -Obtine la cadena desde el indice dado y muestra desde ese punto hasta el final de la cadena.
            * substring()   - Hay uno que te pide el indice de cominzo y final tambien lo puedes usar
        */

        var cadena1 = "Hello World";

        System.out.println("\nCadena original: " +  cadena1);

        var cadenaModificadaSubstring = cadena1.substring(2);
        var cadenaModificadaSubstringInicioFin = cadena1.substring(0,5);

        System.out.println(cadenaModificadaSubstring);
        System.out.println(cadenaModificadaSubstringInicioFin);
    }
}
