package ejemplo01;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        // Definir variables
        String nombre;
        String apellido;
        
        // Crear objeto Scanner para la entrada de datos desde la consola
        Scanner TomarDatos = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingresar nombre: ");
        nombre = TomarDatos.nextLine();
        
        // Solicitar al usuario que ingrese su apellido
        System.out.print("Ingresar apellido: ");
        apellido = TomarDatos.nextLine();
        
        // Cerrar objeto Scanner
        TomarDatos.close();
        
        // Imprimir mensaje de bienvenida
        System.out.println("Hola, " + nombre + " " + apellido + "! Bienvenido!");
    }
}
    