package menuejercicios;

// Clase que hereda de TemperaturaAmbiente
public class TemperaturaUmbral extends TemperaturaAmbiente {
    
    // 2. Crear atributos adicionales
    private int umbralAlerta;

    // 3. Crear constructor que llama al constructor de la clase base
    public TemperaturaUmbral(int temperaturaActual, int umbralAlerta) {
        super(temperaturaActual); // Llama al constructor de TemperaturaAmbiente
        this.umbralAlerta = umbralAlerta;
    }

    // 4. Crear método para verificar si la temperatura supera el umbral
    public void verificarAlerta() {
        if (getTemperaturaActual() > umbralAlerta) {
            System.out.println("¡Alerta! La temperatura ha superado el umbral de " + umbralAlerta + "°C.");
        } else {
            System.out.println("Temperatura normal. La temperatura actual es " + getTemperaturaActual() + "°C.");
        }
    }
}