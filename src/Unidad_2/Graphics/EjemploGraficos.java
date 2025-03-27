package Unidad_2.Graphics;
// Fig. 2.36: EjemploGraficos.java
// Prueba de AppGraficosJPanel.
import java.awt.Color;
import javax.swing.JFrame;

public class EjemploGraficos{
    // ejecuta la aplicación
    public static void main(String[] args){
        // crea marco para LineasRectsOvalosJPanel
        JFrame marco = new JFrame("Dibujo de lineas, rectangulos y ovalos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AppGraficosJPanel appGraficosJPanel = new AppGraficosJPanel();
        appGraficosJPanel.setBackground(Color.WHITE);
        marco.add(appGraficosJPanel);
        marco.setSize(400, 210);
        marco.setVisible(true);
    }
} // fin de la clase EjemploGraficos
