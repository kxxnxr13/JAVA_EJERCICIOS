package MENU;

public class AscensorPeso extends Ascensor {
    private final double LIMITE_PESO = 100.0;

    public void moverAscensorConPeso(int pisoDeseado, double pesoUsuario) {
        if (pesoUsuario > LIMITE_PESO) {
            System.out.println("Error: Peso excede el límite de " + LIMITE_PESO + " kg.");
        } else {
            moverAscensor(pisoDeseado);
        }
    }
}
