package com.LearningJava._03_ManejoDeCadenas;

public class _05_MetodosCadena {
    public static void main(String[] args) {
        /*
            *  Metodos de string o cadenas
            *
            * length()          - Obtien el largo de la cadena
            * replace('' , '')  - reemplaza un atexto o cadena espacio por algo nuevo que le pasemos
            * toUpperCase()     - Pasa el texto minúscula a mayúscula
            * toLowerCase()     - pasa todo el texto a minúscula
            * trim()            - Elimina el espacio al principio y al final
            * strip()           _ Parecido al trim borra los espacios
        */

        //length
        var name = "Juan";
        var largoDeCadena = name.length();

        System.out.println("El largo de la cadena: " + name + " es de: " + largoDeCadena );


        //replace

        var cadena1 = "  Balon  -"; //Aca  veras como se quita el espacio al inicio de la  cadena al usar trim()

        var cadenaModificadaReemplazo = cadena1.replace('B','T');
        System.out.println(cadenaModificadaReemplazo);

        var palabraMayuscula = cadena1.toUpperCase();
        var palabraMinuscula = cadena1.toLowerCase();
        var palabraSinEspacios = cadena1.trim();

        System.out.println(palabraMayuscula);
        System.out.println(palabraMinuscula);
        System.out.println(palabraSinEspacios);


    }
}
