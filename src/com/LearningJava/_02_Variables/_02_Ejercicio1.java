package com.LearningJava._02_Variables;

public class _02_Ejercicio1 {
    public static void main(String[] args) {

        //Escriba los datos de un libro : Name author y country

        String name = "Cien años de soledad";

        String author = "Gabriel García Marquez";

        String country = "Colombia";


        System.out.printf("""
                
                ---------- Data ----------
                Book: %s
                Author: %s
                Country: %s
                """,
                name,
                author,
                country
        );
    }
}
