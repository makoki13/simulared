//import Posicion.*;

public class Nodo {
    private final int id;
    private Posicion posicion;
    private final Tipo tipo;
    private String nombre;
    private IP ip;
    private IP mascara;
    private boolean consistente;  // Indica si la IP y la máscara son coherentes
    private boolean seleccionado; // Indica si el nodo está seleccionado

    // Contador estático para asignar IDs únicos a cada nodo
    private static int idCounter = 1;

    // Constructor que recibe el tipo y la posición del nodo
    public Nodo(Tipo tipo, Posicion posicion) {
        this.id = idCounter++;
        this.tipo = tipo;
        this.posicion = posicion;
        this.consistente = false;
        this.seleccionado = false;
    }

    // Métodos set
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIP(IP ip) {
        this.ip = ip;
        checkConsistencia(); // Verificar consistencia tras asignar IP
    }

    public void borraIP() {
        this.ip = null;
        this.consistente = false;
    }

    public void setMascara(IP mascara) {
        this.mascara = mascara;
        checkConsistencia(); // Verificar consistencia tras asignar máscara
    }

    public void borraMascara() {
        this.mascara = null;
        this.consistente = false;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    // Método para verificar si IP y máscara son coherentes
    public void checkConsistencia() {
        if (ip != null && mascara != null) {
            // Lógica de verificación de coherencia entre IP y máscara
            this.consistente = verificaCoherencia(ip, mascara);
        } else {
            this.consistente = false;
        }
    }

    // Método auxiliar para verificar coherencia de IP y máscara (implementación de ejemplo)
    private boolean verificaCoherencia(IP ip, IP mascara) {
        // Aquí iría la lógica de validación para IP y máscara
        // Retornar true o false según sea coherente
        return ip.esValido() && mascara.esValido();
    }

    // Getters para acceder a las propiedades
    public int getId() {
        return id;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public IP getIP() {
        return ip;
    }

    public IP getMascara() {
        return mascara;
    }

    public boolean isConsistente() {
        return consistente;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }
}
