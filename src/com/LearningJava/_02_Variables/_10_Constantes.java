package com.LearningJava._02_Variables;

public class _10_Constantes {
    public static void main(String[] args) {


        /*
            * Usamos la palabra reservada final
            *
            *
            * final tipoDato  variables = valor
            *
            * El valor de una constante es fijo es decir su valor no cambia
            *
            * Se escriben todo en Mayusculas  separado de un _ bajo
            *
            * CONSTANTE_PI
            *
            * Se pueden declarar ya sea conn tipo o inferido con var
            *
        */

        System.out.println("\n***  Constantes en Java");

        final var PI = 3.1416;
        final  int  DIAS_SEMANA = 7;
        //DIAS_SEMANA = 6;  -- no podemos modificar valor de una constante


        System.out.println("\nPI " + PI);

        System.out.println("\nMath.PI = " + Math.PI);  //Usamos la constante de la libreria Math

        final var mensaje = "\nEsto es todo por hoy en la clase de constantes, sigue aprendiendo";


        System.out.println(mensaje);


        System.out.println();

    }
}
