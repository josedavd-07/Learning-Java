package com.LearningJava._02_Variables;

public class _08_TipoVar {
    public static void main(String[] args) {
        /*
            * Tipo de dato var
            *
            * var solo se usa para nombrar variables locales dentro de los metodos
            *
            * No puede ser usado para nombrar varibles de clases o parametros de metodos.
            *
            *
            * Una vez declarada la variable debe ser inicializada inmediatamente
            *
            *
            * -- var --
            *
            * Este tipo de dato infiere el tipo de dato que se le asigna segun lo que se le asigne eso infiere
            *
            *
            * var numero = 2;
            * var numero;  -- Forma incorrecta, se declara y se asigna com el ejercicio anterior
            *
            * Este infiere que  el dato es de tipo String y por tal manera se comporta como un String
            *
            *  El tipo de dato debe de ser inferible
            *
            * var lista = null; -- no infiere nada proque no tien valro asignado
            *
            * Este dato se introdujo en java 10 con el fin de inferir los tipos de datos dentro de los metodos.
            *
            *
            *
            *
            *

        */
        var name = " Hola soy Carlos y fui asignado en un tipo var";
        String nam2 = "Hola soy Carlos y su declarado en un tipo de dato String";

        var age = 5;
        int age2 = 5;

        System.out.println(name);
        System.out.println(nam2);
    }
}
