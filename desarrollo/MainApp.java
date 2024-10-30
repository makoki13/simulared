import java.awt.*;
import javax.swing.*;

public class MainApp extends JFrame {

    public MainApp() {
        Tipo miTipo;
        Nodo miNodo1, miNodo2;
        Posicion miPosicion;
        Conexion miConexion;
        IP miIP;

        miTipo = new Tipo(1, "TEST", "");
        miPosicion = new Posicion(1,1);
        miNodo1 = new Nodo(miTipo, miPosicion);
        miNodo2 = new Nodo(miTipo, miPosicion);
        miNodo1.setNombre("Nodo 1");
        miNodo2.setNombre("Nodo 2");

        miIP = new IP((short)127, (short)0, (short)0, (short)1);
        System.out.println(miIP.toString());

        miConexion = new Conexion(miNodo1, miNodo2, miTipo);
        System.out.println(miConexion.getNodo1().getNombre() + " . " + miConexion.getNodo2().getNombre());

        Test.addConexion(miConexion);
        System.out.println(Test.getListaConexiones());

        setTitle("Simulared");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        miIP.toString();

        // Panel izquierdo - Paleta de iconos
        // 
        PalettePanel palettePanel = new PalettePanel();
        add(palettePanel, BorderLayout.WEST);

        // Panel principal - Zona de red
        NetworkPanel networkPanel = new NetworkPanel();
        add(networkPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }
}
