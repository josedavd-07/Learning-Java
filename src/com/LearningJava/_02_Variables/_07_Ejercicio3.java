package com.LearningJava._02_Variables;

public  class _07_Ejercicio3 {
    public static void main(String[] args) {
        /*
            * Crear programa de detalles de una tienda
            *
            * Nombre de la tienda
            *
            * Nombre del producto en venta
            *
            * Precio del producto en venta
            *
            * Disponibilidad del producto en venta
            *
            *
            * ---- Mostrar todos los datos en la consola ----
            *
        */



        String nombreTienda = "----------- Tienda Sol Naciente -----------";

        String nomnbreProducto = "Portatil Lenovo v14";

        double precioProducto = 123530.050;

        int cantidadDisponible = 15;

        boolean disponibilidadVenta = true;



        // -------Mostramos datos -----

        System.out.printf("""
                
                %s
                
                Producto en venta: %s
                Precio Producto por unidad: %.0f
                Cantidad Disponible: %d
                Disponible para la venta: %b              
                """,
                nombreTienda,
                nomnbreProducto,
                precioProducto,
                cantidadDisponible,
                disponibilidadVenta
        );




    }
}