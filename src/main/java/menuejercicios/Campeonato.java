package menuejercicios;

public class Campeonato {
    private String equipo;
    private int puntos;

    public Campeonato() {
        equipo = "";
        puntos = 0;
    }

    public void registrarPartido(String equipo, int resultado) {
        this.equipo = equipo;

        if (resultado == 1) {
            puntos = 3; // Gana 3 puntos
        } else if (resultado == 2) {
            puntos = 1; // Empate, 1 punto
        } else if (resultado == 3) {
            puntos = 0; // Pierde, 0 puntos
        } else {
            System.out.println("Resultado no válido.");
            return;
        }

        System.out.println("Resultado registrado para " + equipo);
    }

    public void mostrarClasificacion() {
        if (equipo.isEmpty()) {
            System.out.println("No hay registros de partidos.");
            return;
        }

        System.out.println("\n===== CLASIFICACIÓN =====");
        System.out.println("Equipo: " + equipo);
        System.out.println("Puntos: " + puntos);
    }
}

