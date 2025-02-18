package factura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Factura");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Factura factura = capturarFactura(scanner);
                    factura.mostrarFactura();
                    break;
                
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 2);
        
        scanner.close();
    }

    // Método para capturar datos de la factura
    public static Factura capturarFactura(Scanner scanner) {
        String nombre = leerEntrada("Ingrese el nombre del cliente: ", scanner);
        String producto = leerEntrada("Ingrese el producto: ", scanner);
        int cantidad = Integer.parseInt(leerEntrada("Ingrese la cantidad: ", scanner));
        double precio = Double.parseDouble(leerEntrada("Ingrese el precio unitario: ", scanner));
        boolean esEstudiante = Boolean.parseBoolean(leerEntrada("¿Es estudiante? (true/false): ", scanner));
        char tipoCliente = leerEntrada("Ingrese el tipo de cliente (A, B, C, etc.): ", scanner).charAt(0);

        return new Factura(nombre, producto, cantidad, precio, esEstudiante, tipoCliente);
    }

    // Método reutilizable para leer entradas
    public static String leerEntrada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}