package com.LearningJava._02_Variables;

public class _03_Ejercicio2 {
    public static void main(String[] args) {
        //Escriba los datos de un libro : Name, age, country, height y status - S = Soltero   - C = Casado

        String name = "Cien años de soledad";

        int age = 20;

        String country = "Colombia";

        double height = 177;

        char status = 'S';

        System.out.printf("""
                
                ---------- Presentation ----------
                Book: %s
                Age: %d
                Country: %s
                Height: %.0f cm
                Status: %s
                """,
                name,
                age,
                country,
                height,
                status
        );
    }
}
