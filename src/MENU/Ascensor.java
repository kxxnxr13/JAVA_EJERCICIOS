package MENU;

public class Ascensor {
    private int pisoActual;
    private final int PISO_MINIMO = 1 ;
    private final int PISO_MAXIMO = 10;
    

    public Ascensor() {
        this.pisoActual = 1;
        
    }

    public void moverAscensor(int pisoDeseado) {
        if (pisoDeseado >= PISO_MINIMO && pisoDeseado <= PISO_MAXIMO) {
            System.out.println("Moviendo ascensor al piso " + pisoDeseado + "...");
            pisoActual = pisoDeseado;
            System.out.println("El ascensor ha llegado al piso " + pisoActual);
        } else {
            System.out.println("Error: Piso no válido. Ingrese un número entre " + PISO_MINIMO + " y " + PISO_MAXIMO);
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }
}


