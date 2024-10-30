

public class IP {
    private short octeto1;
    private short octeto2;
    private short octeto3;
    private short octeto4;

    // Constructor que inicializa los cuatro octetos
    public IP(short octeto1, short octeto2, short octeto3, short octeto4) {
        if (isValidOctet(octeto1) && isValidOctet(octeto2) && isValidOctet(octeto3) && isValidOctet(octeto4)) {
            this.octeto1 = octeto1;
            this.octeto2 = octeto2;
            this.octeto3 = octeto3;
            this.octeto4 = octeto4;
        } else {
            throw new IllegalArgumentException("Todos los octetos deben estar en el rango de 0 a 255.");
        }
    }

    // Getters para cada octeto
    public short getOcteto1() {
        return octeto1;
    }

    public short getOcteto2() {
        return octeto2;
    }

    public short getOcteto3() {
        return octeto3;
    }

    public short getOcteto4() {
        return octeto4;
    }

    // Método para validar si un octeto está en el rango de 0 a 255
    private boolean isValidOctet(short octet) {
        return octet >= 0 && octet <= 255;
    }

    // Método para representar la IP en formato String (ejemplo: "192.168.0.1")
    @Override
    public String toString() {
        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }

    public boolean esValido() {
        return true;
    }
}
