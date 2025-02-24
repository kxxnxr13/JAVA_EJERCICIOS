package menuejercicios;

import java.util.Scanner;

public class CajeroAutomatico {
    private double saldo;

    public CajeroAutomatico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void ejecutar(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirarDinero(scanner);
                    break;
                case 3:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + String.format("%.2f", saldo));
    }

    public void retirarDinero(Scanner scanner) {
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();

        if (monto <= 0) {
            System.out.println("⚠️ Error: El monto debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.println("⚠️ Error: Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("✅ Retiro exitoso. Su nuevo saldo es: $" + String.format("%.2f", saldo));
        }
    }
}
