package com.LearningJava.Variables;

public class _05_TiposDatos2 {
    public static void main(String[] args) {
        //Caracter - vienen del unicode ( tabla de caracteres universal) y usan 2 bytes ( 16 bits)

        //Char
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);

        tipoChar = 65; // Valor numerico en la tabla unicode
        System.out.println("tipoChar = " + tipoChar);

        tipoChar = '@';


        //Boleno  - false
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);


        //Tipos de datos de referencias - o tipo de objetos

        //String - Cadena de texto
        //vemos que lo podemos dejar nulo y depues asignar valor o  desde una vez que se crea inicializar su valor

        String tipoString = null;
        System.out.println("tipoString = " + tipoString);
        tipoString = "Hola que tal";
        System.out.println("tipoString = " + tipoString);




    }
}
