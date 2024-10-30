import java.awt.*;
import java.awt.dnd.DnDConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PalettePanel extends JPanel {

    public PalettePanel() {
        setLayout(new GridLayout(5, 1, 5, 5));  // Configuración para los botones de los nodos
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(150, 600));  // Ocupa el 20% de la pantalla

        // Crear y añadir botones para cada tipo de nodo
        add(createNodeButton("Host"));
        add(createNodeButton("Switch"));
        add(createNodeButton("Router"));
        add(createNodeButton("Modem"));
        add(createNodeButton("Repeater"));
    }

    private JButton createNodeButton(String nodeType) {
        JButton button = new JButton(nodeType);
        button.setActionCommand(nodeType);

        // Configuramos TransferHandler para permitir arrastre del texto del nodo
        button.setTransferHandler(new TransferHandler("text") {
            @Override
            public int getSourceActions(JComponent c) {
                return COPY;
            }
        });

        // Añadimos un MouseListener para iniciar el arrastre
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                TransferHandler handler = button.getTransferHandler();
                handler.exportAsDrag(button, e, DnDConstants.ACTION_COPY);
            }
        });

        return button;
    }
}
