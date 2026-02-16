package com.LearningJava._04_EntradaDeDatosConsola;

import java.util.Scanner;

public class _01_EntradaDatosScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Escribe Tu nombre: ");
        name = input.nextLine();
        System.out.println("\n" + name);

    }
}
