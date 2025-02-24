package menuejercicios;

import java.util.Scanner;

public class RegistroBiblioteca {
    public void ejecutar(Scanner scanner) {
        System.out.println("\n===== REGISTRO DE BIBLIOTECA =====");
        StringBuilder biblioteca = new StringBuilder(); // Acumulador de texto
        String continuar;

        do {
            System.out.print("📖 Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("✍️ Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("📄 Ingrese el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            biblioteca.append("📚 Título: ").append(titulo)
                    .append(", Autor: ").append(autor)
                    .append(", Páginas: ").append(paginas).append("\n");

            System.out.print("¿Desea registrar otro libro? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n===== LIBROS REGISTRADOS =====");
        System.out.println(biblioteca.toString());
    }
}

