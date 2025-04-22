package menuejercicios;

import java.util.Scanner;

public class SumaNumeros {

    public void ejecutar(Scanner scanner) {
        int suma = 0;
        String entrada;
        String continuar;

        do {
            System.out.print("Ingrese un número: ");
            entrada = scanner.nextLine();

            try {
                int numero = Integer.parseInt(entrada);
                suma += numero;
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida. Por favor, ingrese un número válido.");
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n✅ La suma total de los números ingresados es: " + suma);
    }
}

