package menuejercicios;

import java.util.Scanner;

public class PromedioNotas {

    public void calcularPromedio(Scanner scanner) {
        double sumaNotas = 0;
        int cantidadNotas = 0;
        String respuesta;

        do {
            System.out.print("Ingrese una nota (0 - 20): ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 20) {
                sumaNotas += nota;
                cantidadNotas++;
            } else {
                System.out.println("⚠️ Nota fuera del rango válido (0-20). Intente de nuevo.");
            }

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.println("Promedio final: " + promedio);

            if (promedio >= 10.5) {
                System.out.println("✅ ¡Aprobado!");
            } else {
                System.out.println("❌ Reprobado.");
            }
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }
    }
}
