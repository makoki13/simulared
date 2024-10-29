import javax.swing.*;
import java.awt.*;
//import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

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
        button.setTransferHandler(new TransferHandler("text") {
            @Override
            public int getSourceActions(JComponent c) {
                return COPY;
            }
        });

        button.addActionListener(e -> {
            Transferable t = new StringSelection(nodeType);
            button.getTransferHandler().exportAsDrag(button, e, TransferHandler.COPY);
        });

        return button;
    }
}
