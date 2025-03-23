package Unidad_2.BorderLayout;
// Fig. 2.9: EjemploBorderLayout.java
// Prueba de AppBorderLayout.
import javax.swing.JFrame;

public class EjemploBorderLayout{
    public static void main(String[] args){
        AppBorderLayout appBorderLayout = new AppBorderLayout();
        appBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appBorderLayout.setSize(400, 300);
        appBorderLayout.setVisible(true);
    }
} // fin de la clase EjemploBorderLayout