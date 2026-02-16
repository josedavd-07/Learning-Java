package com.LearningJava._02_Variables;

public class _04_TiposDatos1 {
    public static void main(String[] args) {

        //--------- Enteros ---------
        // byte - desde -128 hasta 127
        byte tipoByte = 127;
        System.out.println("Valor byte: " + tipoByte);

        //short desde -32,768 hasta 32,767
        short tipoShort = 32000;
        System.out.println("Valor short: " + tipoShort);

        //int - desde -2,147,483,648 hasta 2,147,483,647
        int tipoInt = 2147483647;
        System.out.println("Valor int: " + tipoInt);

        //long - desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        //Se usa la (l) al final para indicar que es un long
        long tipoLong = 9223372036854775807L;
        System.out.println("Valor long: " + tipoLong);

        //--------- FLotantes ---------

        //Float - desde 1.4E-45 hasta 3.4028235E38
        //Se usa la (f) al final para indicar que es un float
        float tipoFloat = 3.4028235E38F;
        System.out.println("Valor float: " + tipoFloat);

        //Double - desde 4.9E-324 hasta 1.7976931348623157E308
        //se usa la (d) al final para indicar que es un double, aunque no es obligatorio
        double tipoDouble = 1.7976931348623157E308;
        System.out.println("Valor double: " + tipoDouble);


    }
}
