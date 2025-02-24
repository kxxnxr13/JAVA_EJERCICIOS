package menuejercicios;

import java.util.Scanner;

public class TiendaOnline {
    private double totalCompra;

    public TiendaOnline() {
        this.totalCompra = 0.0;
    }

    public void ejecutar(Scanner scanner) {
        System.out.println("\n===== TIENDA EN LÍNEA =====");
        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();

            double costoProducto = precio * cantidad;
            totalCompra += costoProducto;

            System.out.println("✅ Producto agregado: " + producto + " - Total: $" + String.format("%.2f", costoProducto));

            System.out.print("¿Desea agregar otro producto? (S/N): ");
            scanner.nextLine(); // Limpiar buffer
            String respuesta = scanner.nextLine().trim().toUpperCase();

            if (!respuesta.equals("S")) {
                seguirComprando = false;
            }
        }

        mostrarTotal();
    }

    public void mostrarTotal() {
        System.out.println("\n🛒 Total de la compra: $" + String.format("%.2f", totalCompra));
        System.out.println("¡Gracias por comprar con nosotros! 🛍️");
    }
}

