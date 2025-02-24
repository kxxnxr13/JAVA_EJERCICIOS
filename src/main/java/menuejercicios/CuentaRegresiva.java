package menuejercicios;

import java.util.Scanner;

public class CuentaRegresiva {
    public void ejecutar(Scanner scanner) {
        System.out.println("\n===== CUENTA REGRESIVA =====");
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        while (numero < 0) {
            System.out.print("❌ Número inválido. Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
        }

        System.out.println("\nIniciando cuenta regresiva... 🚀");

        while (numero >= 0) {
            System.out.println(numero);
            numero--;

            try {
                Thread.sleep(1000); // Espera 1 segundo entre cada número (simulación de cuenta regresiva)
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa del programa.");
            }
        }

        System.out.println("⏳ ¡Tiempo cumplido! 🎉");
    }
}
