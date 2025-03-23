package Unidad_1.Dibujo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class DrawDetector extends JPanel {

    private final ArrayList<Point> points = new ArrayList<>();

    public DrawDetector(){

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Point point : points)
            g.fillOval(point.x, point.y, 6, 6);
    }
}
