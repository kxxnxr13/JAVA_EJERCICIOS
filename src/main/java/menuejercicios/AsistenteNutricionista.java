package menuejercicios;


import java.util.Scanner;

public class AsistenteNutricionista {
    public static void calcularIMC(Scanner scanner) {
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese su altura (ejemplo: 1.70, 170, 1,70): ");
        String alturaStr = scanner.nextLine().replace(",", ".").trim();

        double altura;
        if (alturaStr.contains(".")) {
            altura = Double.parseDouble(alturaStr);
        } else {
            altura = Double.parseDouble(alturaStr) / 100.0;
        }

        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f%n", imc);
        System.out.println("Categoría: " + clasificarIMC(imc));
    }

    private static String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
