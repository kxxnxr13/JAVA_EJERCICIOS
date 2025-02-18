package MENU;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Factura");
            System.out.println("2. Usar Ascensor");
            System.out.println("3. Usar Ascensor con Límite de Peso");
            System.out.println("4. Verificar Temperatura Ambiente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Factura factura = capturarFactura(scanner);
                    factura.mostrarFactura();
                    break;
                case 2:
                    Ascensor ascensor = new Ascensor();
                    manejarAscensor(scanner, ascensor);
                    break;
                case 3:
                    AscensorPeso ascensorConPeso = new AscensorPeso();
                    manejarAscensorConPeso(scanner, ascensorConPeso);
                    break;
                case 4:
                    VerificarTemperatura(scanner);
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static Factura capturarFactura(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el producto: ");
        String producto = scanner.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precio = scanner.nextDouble();
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de cliente (A, B, C, etc.): ");
        char tipoCliente = scanner.nextLine().charAt(0);

        return new Factura(nombre, producto, cantidad, precio, esEstudiante, tipoCliente);
    }

    public static void manejarAscensor(Scanner scanner, Ascensor ascensor) {
        int pisoDeseado;
        while (true) {
            System.out.print("Ingrese el piso al que desea ir (1-10) o 0 para salir: ");
            pisoDeseado = scanner.nextInt();
            if (pisoDeseado == 0) {
                System.out.println("Saliendo del ascensor...");
                break;
            }
            ascensor.moverAscensor(pisoDeseado);
        }
    }

    public static void manejarAscensorConPeso(Scanner scanner, AscensorPeso ascensorConPeso) {
        int pisoDeseado;
        double pesoUsuario;
        while (true) {
            System.out.print("Ingrese el piso al que desea ir (1-10) o 0 para salir: ");
            pisoDeseado = scanner.nextInt();
            
            if (pisoDeseado == 0) {
                System.out.println("Saliendo del ascensor...");
                break;
            }
            System.out.print("Ingrese su peso en kg: ");
            pesoUsuario = scanner.nextDouble();
            
            ascensorConPeso.moverAscensorConPeso(pisoDeseado, pesoUsuario);
        }
    }
    
    public static void VerificarTemperatura(Scanner scanner) {
        System.out.print("ingresar temperatura actual en °C:");
        int temperaturaActual =scanner.nextInt();
        TemperaturaAmbiente sensor =new TemperaturaAmbiente(temperaturaActual);
        sensor.mostrarResultado(); //llama metodo para mostrar resultado
    }
}
