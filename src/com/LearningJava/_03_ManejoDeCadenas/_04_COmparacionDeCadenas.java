package com.LearningJava._03_ManejoDeCadenas;

public class _04_COmparacionDeCadenas {
    public static void main(String[] args) {
        /*
            * Comparación de Cadenas
            *
            * Cuando las cadenas tienen lso mismos carateres no se crea un nuevo espacio de memoria
            * solo se  almacenan en una piscina de cadenas llamada (pool)  es decir el mismo espacio de memoria porque son iguales
            *
            *
            * ==  Compara el mismo espacio de memoria y sui apunta deveulve true si no apunta devuelve false
            * new  Lo usamos para crear otro espacio de memoria con el mismo valro ya no se ira a al pool aun que los caracteres sean iguales
            * equals  Este lo usamos para comparar objetos es decir  ya no compara  el hash de memoria si no su contenido
            *
            * el equals y el == devuelven un booleno
            *
        */

        //Todas dos van a la pool de cadenas ya que usan lso mismos caracteres
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        String cadena3 = new String("Java");

        var espacioEnMemoriaEsIgual = cadena1 == cadena2;
        var espacioEnMemoriaEsIgual2 = cadena1 == cadena3;
        var cadenaEsIgualCadena = cadena1.equals(cadena2);

        System.out.println("Cadena1  es igual en referencia de memoria a cadena2: " + espacioEnMemoriaEsIgual);
        System.out.println("Cadena1  es igual en referencia de memoria a cadena2: " + espacioEnMemoriaEsIgual2);
        System.out.println("Cadena1  es igual a la cadena2: " + cadenaEsIgualCadena);




    }
}
