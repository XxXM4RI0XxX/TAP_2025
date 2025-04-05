package Unidad_2.Graphics2D;
// Fig. 2.42: EjemploFiguras2D.java
// Prueba de AppFiguras2D.
import javax.swing.JFrame;

public class EjemploFiguras2D{
    // ejecuta la aplicación
    public static void main(String[] args){
        // crea marco para objeto FigurasJPanel
        JFrame marco = new JFrame("Dibujo de figuras en 2D");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // crea objeto FigurasJPanel
        AppFiguras2D Figuras2D = new AppFiguras2D();

        marco.add(Figuras2D);
        marco.setSize(425, 200);
        marco.setVisible(true);
    }
} // fin de la clase Figuras