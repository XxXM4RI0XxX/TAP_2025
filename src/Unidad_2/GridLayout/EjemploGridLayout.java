package Unidad_2.GridLayout;

// Fig. 2.12: EjemploGridLayout.java
// Prueba de AppGridLayout.
import javax.swing.JFrame;

public class EjemploGridLayout{
    public static void main(String[] args){
        AppGridLayout appGridLayout = new AppGridLayout();
        appGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appGridLayout.setSize(300, 200);
        appGridLayout.setVisible(true);
    }
} // fin de la clase EjemploGridLayout
