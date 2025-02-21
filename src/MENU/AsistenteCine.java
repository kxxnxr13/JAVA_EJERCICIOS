package MENU;

public class AsistenteCine {
    private int edad;

    public AsistenteCine(int edad) {
        this.edad = edad;
    }

    public String recomendarPelicula() {
        if (edad < 7) {
            return "Te recomendamos ver 'Toy Story', 'Frozen' o 'Peppa Pig: La Película'.";
        } else if (edad <= 17) {
            return "Puedes ver 'Spider-Man: Un Nuevo Universo', 'Los Increíbles', 'Harry Potter' o 'Jumanji'.";
        } else if (edad <= 30) {
            return "Te sugerimos 'Interestelar', 'John Wick', 'El Lobo de Wall Street' o 'Avengers: Endgame'.";
        } else {
            return "Puedes disfrutar de 'El Padrino', 'Forrest Gump', 'Titanic' o 'Casablanca'.";
        }
    }
}

