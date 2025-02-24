package menuejercicios;

import java.util.Scanner;

public class MenuComidaRapida {
    public void ejecutar(Scanner scanner) {
        System.out.println("\n===== MENÚ DE COMIDAS RÁPIDAS =====");
        double total = 0;
        String continuar = "";

        do {
            System.out.println("\n🍔 1. Hamburguesa - $5.99");
            System.out.println("🌭 2. Hot Dog - $3.99");
            System.out.println("🍕 3. Pizza (porción) - $4.50");
            System.out.println("🍟 4. Papas Fritas - $2.99");
            System.out.println("🥤 5. Refresco - $1.99");
            System.out.println("❌ 6. Finalizar pedido");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 5.99;
                    System.out.println("✅ Agregaste: Hamburguesa ($5.99)");
                    break;
                case 2:
                    total += 3.99;
                    System.out.println("✅ Agregaste: Hot Dog ($3.99)");
                    break;
                case 3:
                    total += 4.50;
                    System.out.println("✅ Agregaste: Pizza ($4.50)");
                    break;
                case 4:
                    total += 2.99;
                    System.out.println("✅ Agregaste: Papas Fritas ($2.99)");
                    break;
                case 5:
                    total += 1.99;
                    System.out.println("✅ Agregaste: Refresco ($1.99)");
                    break;
                case 6:
                    System.out.println("\n🛒 Pedido finalizado.");
                    continuar = "n";
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intente nuevamente.");
                    continuar = "s";
                    continue; // Volver al menú
            }

            if (opcion != 6) {
                System.out.print("¿Desea agregar otro producto? (s/n): ");
                continuar = scanner.next();
            }

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n💵 Total a pagar: $" + String.format("%.2f", total));
        System.out.println("🍽️ ¡Gracias por tu compra! Disfruta tu comida. 😃");
    }
}
