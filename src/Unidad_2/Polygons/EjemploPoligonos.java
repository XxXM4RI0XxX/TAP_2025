package Unidad_2.Polygons;
// Fig. 2.40: EjemploPoligonos.java
// Dibujo de polígonos.
import javax.swing.JFrame;

public class EjemploPoligonos{
    // ejecuta la aplicación
    public static void main(String[] args){
        // crea marco para objeto PoligonosJPanel
        JFrame marco = new JFrame("Dibujo de poligonos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AppPoligonos poligonosJPanel = new AppPoligonos();
        marco.add(poligonosJPanel);
        marco.setSize(280, 270);
        marco.setVisible(true);
    }
} // fin de la clase EjemploPoligonos
