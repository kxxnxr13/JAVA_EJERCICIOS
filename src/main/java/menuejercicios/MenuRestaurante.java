package menuejercicios;


import java.util.Scanner;

public class MenuRestaurante {
    private String pedido;
    private double total;

    public MenuRestaurante() {
        pedido = "";
        total = 0.0;
    }

    public void ejecutar(Scanner scanner) {
        int opcion;

        do {
            System.out.println("\n===== MENÚ RESTAURANTE =====");
            System.out.println("1. Ver menú");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Ver cuenta y pagar");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    mostrarMenu();
                    break;
                case 2:
                    realizarPedido(scanner);
                    break;
                case 3:
                    procesarPago(scanner);
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Hamburguesa - $8.50");
        System.out.println("2. Pizza - $10.00");
        System.out.println("3. Pasta - $9.00");
        System.out.println("4. Refresco - $2.50");
        System.out.println("5. Café - $3.00");
    }

    public void realizarPedido(Scanner scanner) {
        System.out.print("Ingrese el número del plato o bebida: ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        double precio = 0;
        String nombre = "";

        switch (opcion) {
            case 1:
                nombre = "Hamburguesa";
                precio = 8.50;
                break;
            case 2:
                nombre = "Pizza";
                precio = 10.00;
                break;
            case 3:
                nombre = "Pasta";
                precio = 9.00;
                break;
            case 4:
                nombre = "Refresco";
                precio = 2.50;
                break;
            case 5:
                nombre = "Café";
                precio = 3.00;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double costo = precio * cantidad;
        pedido += nombre + " (" + cantidad + ") - $" + costo + "\n";
        total += costo;
        System.out.println("Pedido agregado: " + cantidad + " " + nombre + "(s) - $" + costo);
    }

    public void procesarPago(Scanner scanner) {
        if (total == 0) {
            System.out.println("No hay pedidos para pagar.");
            return;
        }

        System.out.println("\n===== MÉTODOS DE PAGO =====");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de crédito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Seleccione el método de pago: ");
        int metodoPago = scanner.nextInt();

        double descuento = 0;
        switch (metodoPago) {
            case 1:
                descuento = total * 0.10;
                System.out.println("Pago en efectivo. Descuento aplicado: 10%");
                break;
            case 2:
                descuento = total * 0.05;
                System.out.println("Pago con tarjeta. Descuento aplicado: 5%");
                break;
            case 3:
                System.out.println("Pago con cheque. No hay descuento.");
                break;
            default:
                System.out.println("Método de pago no válido.");
                return;
        }

        double totalFinal = total - descuento;
        System.out.println("\n===== FACTURA =====");
        System.out.println(pedido);
        System.out.println("Subtotal: $" + String.format("%.2f", total));
        System.out.println("Descuento: $" + String.format("%.2f", descuento));
        System.out.println("Total a pagar: $" + String.format("%.2f", totalFinal));
        System.out.println("¡Gracias por su compra!");

        limpiarPedido();
    }

    private void limpiarPedido() {
        pedido = "";
        total = 0.0;
    }
}