import java.awt.*;
import javax.swing.*;

public class NodeComponent extends JComponent {
    private final String nodeType;

    public NodeComponent(String nodeType) {
        this.nodeType = nodeType;
        setPreferredSize(new Dimension(100, 50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g.drawString(nodeType, 10, 25);
    }
}
