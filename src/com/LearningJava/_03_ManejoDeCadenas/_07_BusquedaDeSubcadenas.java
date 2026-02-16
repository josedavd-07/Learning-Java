package com.LearningJava._03_ManejoDeCadenas;

public class _07_BusquedaDeSubcadenas {
    public static void main(String[] args) {
        /*
            * Busqueda Subcadenas
            *
            * indexOf()       - Nos devuelve el primer indice de la subcadena que estamos buscando
            * lastIndexOf()   - Nos devuelve el ultima aparicion de la frase de la cadena
        */

        var cadena = "Carro";

        var cadenaModificadaPrimerIndice = cadena.indexOf("a");
        var cadenaModificadaUltimoIndice = cadena.lastIndexOf("o");

        //Si no se encuentra el indice se devuelve por defecto -1
        var cadenaNoEncuentraIndice = cadena.indexOf("Java");


        System.out.println(cadenaModificadaPrimerIndice);
        System.out.println(cadenaModificadaUltimoIndice);
        System.out.println(cadenaNoEncuentraIndice);
    }
}
