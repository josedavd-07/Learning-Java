package com.LearningJava._03_ManejoDeCadenas;

public class _03_InmutabilidadDeCadenas {
    public static void main(String[] args) {
        /*
            *Inmutabilidad de las  cadenas
            * Cada vez que se modifica su valer se crea un nuevo espacio de memoria y guarda el otro valor
        */

        // variable creada vale hola
        var cadena1 = "Hola";
        System.out.println("\nValor inicial: " + cadena1);

        //Se cre otro espacio en memoria y se mueve hacia juan
        cadena1 = "juan";
        System.out.println("\nValor modificado cadena 1 que nacio com Hola: " + cadena1);

        //Acá vale juan  y luego cadena 1 valdra camilo
        var cadena2 = cadena1;
        cadena1 = "Camilo";

        System.out.println("\nCadena 2 que toma valor de cadena 1 que nacio como Hola y se cambio a Juan: " + cadena2);
        System.out.println("\nCadena que nacio como hola lueo pasoa juan y ahora camilo: " + cadena1);

    }
}
