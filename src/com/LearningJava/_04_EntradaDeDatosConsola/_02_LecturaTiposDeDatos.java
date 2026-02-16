package com.LearningJava._04_EntradaDeDatosConsola;

import java.util.Scanner;

public class _02_LecturaTiposDeDatos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Lectura de Tipos de Datos (Scanner)
         *
         * nextInt()        - Lee numeros enteros (int)
         * nextFloat()      - Lee numeros decimales tipo float
         * nextDouble()     - Lee numeros decimales tipo double
         * next()           - Lee una palabra (no toma espacios)
         * nextLine()       - Lee una linea completa (incluye espacios)
         *
         * charAt(0)        - Obtiene el primer caracter de una cadena
         * trim()           - Elimina espacios al inicio y al final
         *
         * IMPORTANTE:
         * nextInt(), nextFloat(), nextDouble() y next()
         * NO consumen el salto de linea (Enter)
         * Se debe limpiar con nextLine() despues de usarlos
         */


        int age;
        float salary;
        double salaries;

        char caracter1;
        char caracter2;
        String name;

        System.out.print("Age: ");
        age = input.nextInt();
        System.out.println(age);
        input.nextLine();

        System.out.print("Salary: ");
        salary = input.nextFloat();
        System.out.println(salary);

        System.out.print("Salaries: ");
        salaries = input.nextDouble();
        System.out.println(salaries);
        input.nextLine();


        System.out.print("Character1: ");
        caracter1 = input.next().trim().charAt(0);  // Lee una palabra y tomamos la primera letra quiramos espacio
        System.out.println(caracter1);

        System.out.print("Character2: ");
        caracter2 = input.next().trim().charAt(0);  // Leemos una línea y tomamos la primera letra. quitamos espacio
        System.out.println(caracter2);

        input.nextLine(); //Limpiamos el buffer para poder continuar com la tomada del siguiente dato

        System.out.print("Name: ");
        name = input.nextLine();
        System.out.println(name);

    }
}
