package menuejercicios;
// 1. Crear clase
public class TemperaturaAmbiente {
    
    // 2. Crear atributos
    private int temperaturaActual;
    private final int TEMPERATURA_MINIMA = 18;
    private final int TEMPERATURA_MAXIMA = 25;

    // 3. Crear constructor
    public TemperaturaAmbiente(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    // 4. Crear métodos
    public boolean verificarTemperaturaAdecuada() {
        return temperaturaActual >= TEMPERATURA_MINIMA && temperaturaActual <= TEMPERATURA_MAXIMA;
    }

    public void mostrarResultado() {
        if (verificarTemperaturaAdecuada()) {
            System.out.println("La temperatura es adecuada: " + temperaturaActual + "°C.");
        } else {
            System.out.println("Temperatura fuera del rango deseado. La temperatura actual es: " + temperaturaActual + "°C.");
        }
    }
    
    //metodo getter obtener la tempratura actual
    public int getTemperaturaActual(){
        return temperaturaActual;
    }
}