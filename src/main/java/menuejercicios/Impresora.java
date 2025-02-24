package menuejercicios;

import java.util.Scanner;

public class Impresora {
    private int hojasDisponibles;
    
    public Impresora(int hojasIniciales){
        this.hojasDisponibles = hojasIniciales;
    }
    
    public void ejecutar(Scanner scanner){
        System.out.println("\n===== IMPRESORA =====");
        boolean continuar =true;
        
        while (continuar && hojasDisponibles > 0 ){
            System.out.print("Ingresar cantidad de páginas a imprimir: ");
            int paginas = scanner.nextInt();
            
            if (paginas > hojasDisponibles) {
                System.out.println("No hay suficiente papel. Hojas disponibles: " + hojasDisponibles);
                
            }else {
                hojasDisponibles -= paginas;
                System.out.println("Impresión exitosa. paginas impresas: "+ paginas);
                System.out.println("hojas restantes: " + hojasDisponibles);
            }
            
            if (hojasDisponibles > 0){
                System.out.println("¿Desea omprimir otra vez (S/N): ");
                scanner.nextLine();
                String respuesta = scanner.nextLine().trim().toUpperCase();
                
                if (!respuesta.equals("S")){
                    continuar = false;
                }
            }else{
                System.out.println("No hay más hojas disponibles. Recarga la impresora.");
            }
        }
    }  
}
