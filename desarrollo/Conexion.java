public class Conexion {
    private Nodo nodo1;
    private Nodo nodo2;
    private Tipo tipo;
    private boolean seleccionado;

    // Constructor que inicializa Nodo1, Nodo2 y Tipo
    public Conexion(Nodo nodo1, Nodo nodo2, Tipo tipo) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.tipo = tipo;
        this.seleccionado = false;
    }

    // Método para establecer Nodo1
    public void setNodo1(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    // Método para eliminar Nodo1
    public void removeNodo1() {
        this.nodo1 = null;
    }

    // Método para establecer Nodo2
    public void setNodo2(Nodo nodo2) {
        this.nodo2 = nodo2;
    }

    // Método para eliminar Nodo2
    public void removeNodo2() {
        this.nodo2 = null;
    }

    // Método para establecer el Tipo
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Método para establecer el estado de selección de la conexión
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    // Getters para acceder a las propiedades
    public Nodo getNodo1() {
        return nodo1;
    }

    public Nodo getNodo2() {
        return nodo2;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    // Método para representar la conexión en formato String
    @Override
    public String toString() {
        return "Conexion{" +
                "nodo1=" + (nodo1 != null ? nodo1.getNombre() : "null") +
                ", nodo2=" + (nodo2 != null ? nodo2.getNombre() : "null") +
                ", tipo=" + (tipo != null ? tipo.getNombre() : "null") +
                ", seleccionado=" + seleccionado +
                '}';
    }
}
