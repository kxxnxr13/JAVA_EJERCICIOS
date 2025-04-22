package menuejercicios;

import java.util.Scanner;

public class SensorTemperaturaLoop {
    public void verificarTemperatura(Scanner scanner) {
        int temperatura;

        do {
            System.out.print("Ingrese la temperatura actual en °C: ");
            temperatura = scanner.nextInt();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println("⚠️ Alerta: Temperatura fuera del rango aceptable (18°C - 25°C). Intente nuevamente.");
            } else {
                System.out.println("✅ Temperatura dentro del rango aceptable.");
            }

        } while (temperatura < 18 || temperatura > 25);
    }
}

