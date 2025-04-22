package menuejercicios;

import java.time.LocalTime;
import java.util.Scanner;

public class RegistroParqueadero {

    public void registrarVehiculos(Scanner scanner) {
        System.out.print("Ingrese el número de vehículos que ingresarán: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] placas = new String[cantidadVehiculos];
        String[] horasIngreso = new String[cantidadVehiculos];

        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo #" + (i + 1) + ": ");
            placas[i] = scanner.nextLine();

            horasIngreso[i] = LocalTime.now().toString(); // Hora actual
            System.out.println("Hora de ingreso registrada: " + horasIngreso[i]);
        }

        System.out.println("\n===== RESUMEN DE VEHÍCULOS REGISTRADOS =====");
        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.println("🚗 Placa: " + placas[i] + " | Hora de ingreso: " + horasIngreso[i]);
        }
    }
}
