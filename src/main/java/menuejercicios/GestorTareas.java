package menuejercicios;

import java.util.Scanner;

public class GestorTareas {

    public void gestionarTareas(Scanner scanner) {
        StringBuilder listaTareas = new StringBuilder();
        String respuesta;

        System.out.println("📋 GESTOR DE TAREAS");

        do {
            System.out.print("Ingrese la descripción de la tarea: ");
            String descripcion = scanner.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (ej: 2025-05-01): ");
            String fecha = scanner.nextLine();

            listaTareas.append("🔹 Tarea: ").append(descripcion)
                    .append(" | Vence: ").append(fecha)
                    .append("\n");

            System.out.print("¿Desea agregar otra tarea? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("\n===== LISTA DE TAREAS =====");
        System.out.println(listaTareas.toString());
    }
}
