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
            System.out.println("5. Verificar Temperatura con Umbral de Alerta");
            System.out.println("6. Ascensor con sensor de ambiente");
            System.out.println("7. Tienda productos ");
            System.out.println("8. Calcular IMC");
            System.out.println("9. Salir");
            System.out.println("10. Asitente Cine");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

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
                    manejarTemperaturaAmbiente(scanner);
                    break;

                case 5:
                    manejarSensorTemperaturaAlerta(scanner);
                    break;
                case 6:
                    AscensorTemperatura ascensortemp = new AscensorTemperatura();
                    manejarAscensorConTemperatura(scanner, ascensortemp);
                    break;
                case 7:
                     manejarCompraProductos(scanner);
                     break;
                     
                case 8:
                    calcularIMC(scanner);
                    break;
                case 10:  
                    recomendarPelicula(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 10);

        scanner.close();
    }

    



    // Métodos aux de factura num 1
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
        System.out.print("Ingrese el tipo de cliente (A, B, C, etc.): ");
        char tipoCliente = scanner.next().charAt(0);

        return new Factura(nombre, producto, cantidad, precio, esEstudiante, tipoCliente);
    }
    
  

    
    
    public static String leerEntrada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    //metodo ascensor num 2
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
            System.out.println("Piso actual: " + ascensor.getPisoActual());
        }
    }
    //metodo ascensor con peso limite num 3
    public static void manejarAscensorConPeso(Scanner scanner, AscensorPeso ascensorConPeso) {
        int pisoDeseadoPeso;
        double pesoUsuario;
        while (true) {
            System.out.print("Ingrese el piso al que desea ir (1-10) o 0 para salir: ");
            pisoDeseadoPeso = scanner.nextInt();            
           
            if (pisoDeseadoPeso == 0) {
                System.out.println("Saliendo del ascensor...");
                break;  
            }

            System.out.println("Ingrese su peso en kg: ");
            pesoUsuario = scanner.nextDouble();
            
            
            ascensorConPeso.moverAscensorConPeso(pisoDeseadoPeso, pesoUsuario);
            System.out.println("Piso actual: " + ascensorConPeso.getPisoActual());
        }
    }

        // Método auxiliar para manejar la temperatura ambiente num 4
    public static void manejarTemperaturaAmbiente(Scanner scanner) {
        System.out.print("Ingrese la temperatura actual: ");
        int temperaturaActual = scanner.nextInt();
        TemperaturaAmbiente temperatura = new TemperaturaAmbiente(temperaturaActual);
        temperatura.mostrarResultado();
    }
    
        // Método para manejar el sensor de temperatura con umbral de alerta num 5
    public static void manejarSensorTemperaturaAlerta(Scanner scanner) {
        System.out.print("Ingrese la temperatura actual: ");
        int temperaturaActual = scanner.nextInt();
        System.out.print("Ingrese el umbral de alerta: ");
        int umbralAlerta = scanner.nextInt();
        TemperaturaUmbral sensor = new TemperaturaUmbral(temperaturaActual, umbralAlerta);
        sensor.verificarAlerta();
    }
    
    // metodo para manejar Ascensor num 6
    public static void manejarAscensorConTemperatura(Scanner scanner, AscensorTemperatura ascensorTemp) {
    int pisoDeseado;
    
    int TEMPERATURA_ACTUAL;
    
    while (true) {
        System.out.print("Ingrese el piso al que desea ir (1-10) o 0 para salir: ");
        pisoDeseado = scanner.nextInt();
        if (pisoDeseado == 0) {
            System.out.println("Saliendo del ascensor...");
            break; 
        }
        
        System.out.print("Ingrese la temperatura ambiente actual: ");
        TEMPERATURA_ACTUAL = scanner.nextInt();
        
        ascensorTemp.moverAscensorConTemperatura(pisoDeseado, TEMPERATURA_ACTUAL);
        System.out.println("Piso actual: " + ascensorTemp.getPisoActual());
    }
    }
    
    public static void manejarCompraProductos(Scanner scanner) {
        System.out.print("Ingrese el tipo de producto (A: Alimentos, V: Vestimenta, E: Electrónicos): ");
        char tipoProducto = scanner.next().toUpperCase().charAt(0);
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = scanner.nextDouble();

        TiendaProducto tiendaProducto = new TiendaProducto(tipoProducto, cantidad, precioUnitario);
        tiendaProducto.calcularCosto();
        tiendaProducto.mostrarResumen();
    }
    
        public static void calcularIMC(Scanner scanner) {
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        AsistenteNutricionista asistente = new AsistenteNutricionista(peso, altura);
        double imc = asistente.calcularIMC();
        String categoria = asistente.obtenerCategoriaIMC();

        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
    }
        
    public static void recomendarPelicula(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        AsistenteCine asistente = new AsistenteCine(edad);
        String recomendacion = asistente.recomendarPelicula();

        System.out.println("Recomendación de película: " + recomendacion);
    }
}


    
    
