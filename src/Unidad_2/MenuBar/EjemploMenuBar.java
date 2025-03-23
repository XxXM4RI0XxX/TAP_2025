package Unidad_2.MenuBar;
// Fig. 2.20: EjemploMenuBar.java
// Prueba de AppMenuBar.
import javax.swing.JFrame;

public class EjemploMenuBar {
    public static void main(String[] args) {
        AppMenuBar appMenuBar=new AppMenuBar();
        appMenuBar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appMenuBar.setBounds(0,0,300,200); // establece tamaño y posición del marco
        appMenuBar.setVisible(true);

    }
} // fin de la clase EjemploMenuBar
