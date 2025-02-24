package menuejercicios; 

import java.util.Scanner;

public class ViajeCoche {
    public void ejecutar(Scanner scanner){
        System.out.println("/n===== SIMULADOR DE VIAJE COCHE=====");
        boolean continuar=true;
        while(continuar){
            System.out.print("Ingresar distancia total de viaje (en km: )");
            double distancia = scanner.nextDouble();
            
            System.out.print("Ingresar velocidad promedio del coche (en km/h): ");
            double velocidad = scanner.nextDouble();
            
            if (velocidad > 0){
                double tiempo = distancia/velocidad;
                System.out.printf("tiempo estimado de viaje: %.2f horas\n,", tiempo);
                
            }else{
                System.out.println("La velocidad debe ser mayor que 0. intente de nuevo.");
            }
            
            System.out.print("¿Desea calcular otro viaje? (S/N): ");
            scanner.nextLine();
            String respuesta = scanner.nextLine().trim().toUpperCase();
            
            if (!respuesta.equals("S")){
                continuar = false;
            }   
        }
    }
}