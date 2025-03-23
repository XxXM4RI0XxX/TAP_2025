package Unidad_1.Mouse;// Fig. 1.25: MouseDetector.java
// Prueba de MouseDetector.
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        MouseDetector MouseDetector = new MouseDetector();
        MouseDetector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MouseDetector.setSize(300, 100);
        MouseDetector.setVisible(true);
    }
} // fin de la clase RastreadorRaton