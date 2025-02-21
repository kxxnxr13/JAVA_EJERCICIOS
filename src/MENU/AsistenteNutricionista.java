package MENU;

public class AsistenteNutricionista {
    private double peso;
    private double altura;

    public AsistenteNutricionista(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String obtenerCategoriaIMC() {
        double imc = calcularIMC();

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
