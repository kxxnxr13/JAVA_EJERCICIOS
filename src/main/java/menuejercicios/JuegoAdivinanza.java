package menuejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public void ejecutar(Scanner scanner) {
        System.out.println("\n===== JUEGO DE ADIVINANZA =====");
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intento;
        int intentosRealizados = 0;
        
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            intentosRealizados++;

            if (intento < numeroSecreto) {
                System.out.println("📉 El número secreto es mayor. ¡Sigue intentando!");
            } else if (intento > numeroSecreto) {
                System.out.println("📈 El número secreto es menor. ¡Sigue intentando!");
            } else {
                System.out.println("\n🎉 ¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos. 🎯");
            }

        } while (intento != numeroSecreto);
    }
}
