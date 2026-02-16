package com.LearningJava._02_Variables;

public class _01_Variables {
    public static void main(String[] args) {

        /*
         * Tipos de Datos primitivos:
         *
         * Enteros : int   - va de -10 hasta 127
         * FLotantes : float -  va de    12.6 hasta com por ejemplo numero Pi 2,1416
         * Caracter : char . de tipo cademna de texto, peeo solo recibe un dato de tipo carcter ejemplo: '@'
         * Boleano : boolean: true, false, es un valor logico de 0 y 1  usado para decisiones
         *
         *
         * Tipos de datos  Object (referencia): Estks almacenan refereencias a objectos
         *
         * Cadenas: String - ejemplo: "Juan"
         * Arreglos: Amalcena multiples valores en una sola variables del mismo tipo: int [] , String[]
         *
         * Objetos: instancias que creamos de nuestras clases al referenciarlas
         *
         *
         */

        // Variable del termino varia que puede cambiar de valor durante la ejecución del programa

        //Sintaxis variables : Tipo de Dato nombre y valor. - Acá definimos y inicializamos valor
        String name = "valor";
        int age = 10;

        //Definicíon sin inicializar para su uso posterior a su creación.
        double salary;

        //Asignamos valor
        salary = 222.0000;

        //Variable de tipo objeto porque venimos de la clase : String
        String message = "Hola Mundo";

        char gender = 'M';

        //Mostramos datos

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(message);
        System.out.println(gender);

        //Cambiamos valor y ya veremos com cambia a diferencia del primer valro gender de M a F

        gender = 'F';

        System.out.println(gender);

    }
}
