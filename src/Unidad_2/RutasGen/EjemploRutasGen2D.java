package Unidad_2.RutasGen;
// Fig. 2.44: EjemploRutasGen2D.java
// Demostración de una ruta general.
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EjemploRutasGen2D{
    // ejecuta la aplicación
    public static void main(String[] args) throws InterruptedException {
        // crea marco para Figuras2JPanel
        JFrame marco = new JFrame("Dibujo de figuras en 2D");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AppRutasGen2D rutasGen2D = new AppRutasGen2D();
        marco.add(rutasGen2D);
        marco.setBackground(Color.WHITE);
        for(int i = 1; i < 10000; i+=1){
            Thread.sleep(3);
            marco.setSize(i, i);
            marco.setVisible(true);
        }

    }
} // fin de la clase EjemploRutasGen2D