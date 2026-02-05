package  com.LearningJava.Variables;

public class _06_Convenciones {
    public static void main(String[] args) {

        //-------Malas practicas para nombrar variables--------


        //No se usa de variable en java una palabra reservada
        //int class = 10; // Error de compilacion

        //No se puede iniciar el nombre de una variable con numero
        //String 1nombre = "Juan"; // Error de compilacion

        //No se pueden usar espacios en blanco en el nombre de una variable
        //double altura del jugador = 1.75; // Error de compilacion

        //No se pueden usar caracteres especiales en el nombre de una variable
        //char @letra = 'A'; // Error de compilacion


        //-------Buenas practicas para nombrar variables--------

        String nombreCompleto = "Ana Maria";
        int edadUsuario = 30;
        double salarioMensual = 2500.50;
        boolean esEmpleadoActivo = true;
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad Usuario: " + edadUsuario);
        System.out.println("Salario Mensual: " + salarioMensual);
        System.out.println("Es Empleado Activo: " + esEmpleadoActivo);

        //Distinción entre mayúsculas y minúsculas
        int numero = 10;
        int Numero = 20; // Variable diferente debido a la mayúscula
        System.out.println("numero: " + numero);
        System.out.println("Numero: " + Numero);

        //Nombrar clases con mayusculas al inicio
        //public class MiClase {}


        //NOmbrar metodos y variables con minusculas al inicio y usar camelCase
        //public void miMetodoEjemplo() {}
        //int miVariableEjemplo = 5;


        //ser descriptivos en los nombres
        int diasEnSemana = 7;
        System.out.println("Días en una semana: " + diasEnSemana);

        //prefijos y sufijos comunes si son nnecesarios no usar anglicismos innecesarios
        String strNombre = "Carlos"; // prefijo str para indicar que es una cadena
        int intEdad = 25; // prefijo int para indicar que es un entero
        double dblSalario = 3000.75; // prefijo dbl para indicar que es un double
        System.out.println("strNombre: " + strNombre);

        System.out.println("intEdad: " + intEdad);
        System.out.println("dblSalario: " + dblSalario);
        System.out.println("Fin del programa de convenciones de nombres");

        //No abusar de las abreviaturas
        int numeroDeEstudiantes = 40; // Claro y descriptivo
        //int numEst = 40; // Menos claro
        System.out.println("Número de Estudiantes: " + numeroDeEstudiantes);









    }
}