import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class NetworkPanel extends JPanel {
    private final ArrayList<NodeComponent> nodes = new ArrayList<>();

    public NetworkPanel() {
        setBackground(Color.WHITE);
        setLayout(null);  // Layout absoluto para colocar nodos en cualquier posición

        // Añadir soporte para drag-and-drop
        setDropTarget(new DropTarget(this, DnDConstants.ACTION_COPY, new DropTargetAdapter() {
            @Override
            @SuppressWarnings("CallToPrintStackTrace")
            public void drop(DropTargetDropEvent dtde) {
                try {
                    Transferable transferable = dtde.getTransferable();
                    if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY);
                        String nodeType = (String) transferable.getTransferData(DataFlavor.stringFlavor);

                        Point dropPoint = dtde.getLocation();
                        addNode(nodeType, dropPoint.x, dropPoint.y);
                        dtde.dropComplete(true);
                    } else {
                        dtde.rejectDrop();
                    }
                } catch (UnsupportedFlavorException | IOException ex) {
                    ex.printStackTrace();
                    dtde.rejectDrop();
                }
            }
        }, true));
    }

    private void addNode(String nodeType, int x, int y) {
        NodeComponent node = new NodeComponent(nodeType);
        node.setBounds(x, y, 100, 50);  // Tamaño y posición del nodo
        add(node);
        nodes.add(node);
        repaint();
    }

    public ArrayList<NodeComponent> getNodes() {
        return nodes;
    }
}
