package com.LearningJava._03_ManejoDeCadenas;

public class _09_ConcatenacionDeCadenas {
    public static void main(String[] args) {
        /*
            * Concatenación de cadenas
            *
            * +                - Esta ees la forma mas tradicional
            * concat()         - Esta nos permite concatenar cadenas
            * StringBuilder()  - Es un constructor de cadenas, es mutable,  para crear cadenas repetitivas crconstre una sola cadena
            * StringBuffer()   - Para trbajar con hilos o muchos procesos a al vez
            * join             - Unimos dos o mas cadenas
            *
        */

        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        var concatenacionTradicional = cadena1 + " " + cadena2;
        var concatenacionConcat = cadena1.concat(" ").concat(cadena2);

        var constructorDeCadenas = new StringBuilder();
//          constructorDeCadenas.append(cadena1);
//          constructorDeCadenas.append(" ");
//          constructorDeCadenas.append( cadena2);
            constructorDeCadenas.append(cadena1).append(" ").append(cadena2);  // Aquí se simplifica una sola línea

        var constructorEnHilo = new StringBuffer();
            constructorEnHilo.append(cadena1).append("  ").append(cadena2);

        var cadenaUnidaJoin = String.join(" ", cadena1, cadena2);

        var cadenaCreadaConstructor = constructorDeCadenas.toString();
        var cadenaCreadaHilos = constructorEnHilo.toString();
        var cadenaCreadaJoin = cadenaUnidaJoin.toString();

        System.out.println("\nCadena unida de forma tradicional con '+' :  " + concatenacionTradicional);
        System.out.println("\nCadena unida con 'concat' : " + concatenacionConcat);
        System.out.println("\nCadena unida con 'StringBuilder' : " + cadenaCreadaConstructor);
        System.out.println("\nCadena unida con 'StringBuffer' : " + cadenaCreadaHilos);
        System.out.println("\nCadena unida con 'join' : " + cadenaCreadaJoin);



    }
}
