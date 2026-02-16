package com.LearningJava._04_EntradaDeDatosConsola;

import java.util.Scanner;

public class _03_ConversionTiposDeDatosPorConsola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            * Conversion de tipos de datos en entrada
            *  Integer.parseInt()  - pasa un tipo de dato string a entero.
            *
        */


        String numeroEnteroString1;
        String numeroEnteroString2;

        System.out.print("\nEscribe un numero entero: ");
        numeroEnteroString1 = input.nextLine();

        System.out.print("\nEscribe un numero entero: ");
        numeroEnteroString2 = input.nextLine();

        //suma numeros String
        var sumaString = numeroEnteroString1 + numeroEnteroString2;
        System.out.println("\nSuma de Srings - no se suman se concatenan: " + sumaString + "\n");

        //-----  Parseo de Strings a int antes de sumar --------

        int numeroEnteroParseadoInt1 = Integer.parseInt(numeroEnteroString1);
        System.out.println(numeroEnteroParseadoInt1);

        int numeroEnteroParseado2 = Integer.parseInt(numeroEnteroString2);
        System.out.println(numeroEnteroParseado2);

        var sumaEnterosParseados = numeroEnteroParseadoInt1 + numeroEnteroParseado2;
        System.out.println("\nSuma de numeros parseados - se pueden sumar ya que estan parseados a int: " + sumaEnterosParseados);



        
    }
}
