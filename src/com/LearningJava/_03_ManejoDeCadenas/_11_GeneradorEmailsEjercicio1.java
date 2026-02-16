package com.LearningJava._03_ManejoDeCadenas;

public class _11_GeneradorEmailsEjercicio1 {
    public static void main(String[] args) {
        /*
            * Generador de Emails
             *
             * Nombre: Jose David Carranza Angarita
             * Empresa: Moon Game Studio
             * Dominio: .com
             *
             * Salidaesperada:   jose.david.carranza.angarita@moongamestudio.com
        */

        String name = " Jose David Carranza Angarita ";
        String company = "Moon Game Studio";
        String domain = ".com";


        //Concat
        var newName1 = name.trim(); // o .strip
        var newName = newName1.toLowerCase().replace(" " , ".");
        var newCompany = company.toLowerCase().replace(" " , "");
        var newDomain = domain.toLowerCase();

        var correoElectronico = newName.concat("@").concat(newCompany).concat(newDomain);


        //StringBuilder

        var construirCorreoElectronico = new StringBuilder();
            construirCorreoElectronico
                    .append(name.trim().toLowerCase().replace(" " , "."))
                    .append("@")
                    .append(company.toLowerCase().replace(" " , ""))
                    .append(newDomain.toLowerCase().replace(" " , ""))
            ;


        // Resultados
        System.out.println("\n" + correoElectronico);
        System.out.println("\n" + construirCorreoElectronico);
    }

}
