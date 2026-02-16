package com.LearningJava._03_ManejoDeCadenas;

public class _01_ManejoDeCadenas {

    public static void main(String[] args) {

        /*
         * Como  manejamos las cadenas
         *
         * Manejamos java como una secuencia de cartacteres
         *
         * Estas a su vez vienen de objetos es decir vienen de la clase Object
         *
         * Al utilizarlass creamos las instancias de  ella ya que como son  obketos las llamamos y la usamos.
         *
         * Tambien existen las text block  que se declaran con """ """   doble comilla triple la cual podemos usar
         * para poder  escribir texto en bloques.
         *
         * Podemos usar el new String para llamar y crear ya que es un objeto
         *
         */


        var texBlockString = """
            
            ----- Miremos como aqui se usa
            un escrito de texto de bloque
            haciendo uso del text block
            
            y podemos hacer saltos de línea ------
            
            """;


        System.out.println(texBlockString);

        var cadena1 = "Hola";

        var cadena2 = new String("Mundo<<<<<<<<<A");

        var cadena3 = cadena1 + " " + cadena2;

        System.out.println(cadena3);






    }

}
