import java.util.ArrayList;
import java.util.List;

public class Tipo {
    private int id;
    private String nombre;
    private String logo;

    // Constructor que inicializa los atributos
    public Tipo(int id, String nombre, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogo() {
        return logo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    // Clase estática TipoManager para gestionar la lista de tipos
    public static class TipoManager {
        private static final List<Tipo> tipos = new ArrayList<>();

        // Método para añadir un nuevo tipo a la lista
        public static void addTipo(Tipo tipo) {
            tipos.add(tipo);
        }

        // Método para eliminar un tipo de la lista por ID
        public static boolean removeTipoById(int id) {
            return tipos.removeIf(tipo -> tipo.getId() == id);
        }

        // Método para obtener un tipo por ID
        public static Tipo getTipoById(int id) {
            return tipos.stream()
                        .filter(tipo -> tipo.getId() == id)
                        .findFirst()
                        .orElse(null);
        }

        // Método para obtener todos los tipos
        public static List<Tipo> getAllTipos() {
            return new ArrayList<>(tipos);
        }

        // Método para buscar un tipo por nombre
        public static Tipo findTipoByNombre(String nombre) {
            return tipos.stream()
                        .filter(tipo -> tipo.getNombre().equalsIgnoreCase(nombre))
                        .findFirst()
                        .orElse(null);
        }

        // Método para limpiar la lista de tipos
        public static void clearTipos() {
            tipos.clear();
        }
    }
}
