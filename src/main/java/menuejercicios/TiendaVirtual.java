package menuejercicios;

import java.util.Scanner;

public class TiendaVirtual {

    public void realizarCompra(Scanner scanner) {
        String resumenProductos = "";
        double totalCompra = 0.0;
        String continuar;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // limpiar el buffer

            totalCompra += precio;
            resumenProductos += "🛒 Producto: " + producto + " | Precio: $" + precio + "\n";

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n===== RESUMEN DE COMPRA =====");
        System.out.println(resumenProductos);
        System.out.printf("💰 Total a pagar: $%.2f\n", totalCompra);
    }
}
