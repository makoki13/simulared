public class Posicion {
    private int x;
    private int y;

    // Constructor que inicializa las coordenadas X e Y
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters para acceder a las coordenadas
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters para modificar las coordenadas
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para representar la posición en formato String
    @Override
    public String toString() {
        return "Posicion(" + "x=" + x + ", y=" + y + ')';
    }
}
