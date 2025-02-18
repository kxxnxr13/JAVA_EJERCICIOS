package condicionalifelse;

import java.util.Scanner;

public class CondicionalIfElse {
    public static void main(String[] args) {
        parImpar();
    }

    public static void parImpar() {
        // Crear objeto Scanner
        Scanner TomarDatos = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        
        // Capturar el número ingresado por el usuario
        int numero = TomarDatos.nextInt();
        
        // Cerrar el objeto Scanner
        TomarDatos.close();
        
        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
