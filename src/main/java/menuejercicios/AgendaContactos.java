package menuejercicios;

import java.util.Scanner;

public class AgendaContactos {

    public void registrarContactos(Scanner scanner) {
        String listaContactos = "";
        String continuar;

        do {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            String telefono = scanner.nextLine();

            listaContactos += "📇 Nombre: " + nombre + " | Teléfono: " + telefono + "\n";

            System.out.print("¿Desea agregar otro contacto? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n===== AGENDA DE CONTACTOS =====");
        System.out.println(listaContactos);
    }
}
