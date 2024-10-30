import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final List<Conexion> listaConexiones = new ArrayList<>();
    private static boolean estado = false;

    // Método para añadir una conexión a la lista
    public static void addConexion(Conexion conexion) {
        listaConexiones.add(conexion);
        checkEstado(); // Actualiza el estado cada vez que se añade una conexión
    }

    // Método para verificar el estado de las conexiones
    public static void checkEstado() {
        estado = !listaConexiones.isEmpty(); // Estado es true si hay conexiones en la lista
    }

    // Getter para obtener el estado de la lista de conexiones
    public static boolean getEstado() {
        return estado;
    }

    // Método para obtener la lista de conexiones
    public static List<Conexion> getListaConexiones() {
        return new ArrayList<>(listaConexiones); // Retorna una copia para seguridad
    }

    // Método para limpiar todas las conexiones y actualizar el estado
    public static void clearConexiones() {
        listaConexiones.clear();
        checkEstado();
    }
}
