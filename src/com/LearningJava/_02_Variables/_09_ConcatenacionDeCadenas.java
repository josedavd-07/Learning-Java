package com.LearningJava._02_Variables;

public class _09_ConcatenacionDeCadenas {

    public static void main(String[] args) {

        /*
            * Contatenaciones
            *
            * la forma mas facil es con el  operador : +  -- Ojo no confundir no es suma mientras este entre cadenas
        */


        //Concatenemos algunos  var

        var name = "Jose";
        var name2 = "Manuel";

        //Si no le ponemos el " " lo que podemos hacer es darle un espcaio al  declarar depende de donde queremos el espacio.
        // var name = "Jose";
        // var name2 = " Manuel"; aca puede ser y no quedaran juntos o en la primera al final


        var fullName = name + " " + name2; // -- si le quitamos los " " quedan pegados  eso dependera de como queremos que se muestre

        String color = "Amarillo";
        String colr2 = " Verde";

        String colores = color + colr2;

        print(colores);
        print(fullName);

    }

    //Esto es una funcion para imprimir usando el sout de java
    public static void print( String message){
        System.out.println(message);
    }
}
