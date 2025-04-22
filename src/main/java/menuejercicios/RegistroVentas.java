package menuejercicios;

import java.util.Scanner;

public class RegistroVentas {

    public void registrarVentas(Scanner scanner) {
        StringBuilder resumenVentas = new StringBuilder();
        double totalVentas = 0;
        String respuesta;

        System.out.println("🧾 REGISTRO DE VENTAS");

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            totalVentas += precio;
            resumenVentas.append("🛒 Producto: ").append(producto)
                    .append(" | Precio: $").append(precio).append("\n");

            System.out.print("¿Desea registrar otra venta? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("\n===== RESUMEN DE VENTAS =====");
        System.out.println(resumenVentas.toString());
        System.out.println("💰 Total vendido: $" + totalVentas);
    }
}

