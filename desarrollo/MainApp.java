import java.awt.*;
import javax.swing.*;

public class MainApp extends JFrame {

    public MainApp() {
        setTitle("Simulared");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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
