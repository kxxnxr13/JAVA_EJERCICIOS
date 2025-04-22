package menuejercicios;

import java.util.Scanner;

public class ProcesoVentas {
    public void ejecutar(Scanner scanner) {
        String nombreProducto, resumenVentas = "";
        double precio, totalVentas = 0;
        int cantidad;
        String continuar;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            precio = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese la cantidad vendida: ");
            cantidad = Integer.parseInt(scanner.nextLine());

            double subtotal = precio * cantidad;
            totalVentas += subtotal;

            resumenVentas += "- " + nombreProducto + " | Cantidad: " + cantidad + " | Subtotal: $" + String.format("%.2f", subtotal) + "\n";

            System.out.print("¿Desea ingresar otra venta? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n===== RESUMEN DE VENTAS =====");
        System.out.println(resumenVentas);
        System.out.println("💰 Total de ventas: $" + String.format("%.2f", totalVentas));
    }
}
