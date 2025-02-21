package MENU;


public class AscensorTemperatura extends Ascensor{
    private final int TEMPERATURA_MINIMA = 18;
    private final int TEMPERATURA_MAXIMA = 25;
    
    public boolean verificarTemperatura(int temperatura) {
        return temperatura >= TEMPERATURA_MINIMA && temperatura <= TEMPERATURA_MAXIMA;
        
    }
    public void moverAscensorConTemperatura(int pisoDeseado, int TEMPERATURA_ACTUAL) {
        if (!verificarTemperatura(TEMPERATURA_ACTUAL)){
            System.out.println(" la temperatura no es adecuada para mover el ascensor. "
                               + "Debe estar entre " + TEMPERATURA_MINIMA + "° Y " + TEMPERATURA_MAXIMA + "°.");
            return;
        }    
            super.moverAscensor(pisoDeseado);
    }
    
}
    

