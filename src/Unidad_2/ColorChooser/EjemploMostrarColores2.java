package Unidad_2.ColorChooser;
// Fig. 2.29: EjemploMostrarColores2.java
// Selección de colores con JColorChooser.
//import java.awt.GraphicsEnvironment;
//import java.util.Arrays;
import javax.swing.JFrame;

public class EjemploMostrarColores2{
    // ejecuta la aplicación

    public static void main(String[] args){
        AppJColorChooser aplicacion = new AppJColorChooser();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600, 230);
        aplicacion.setVisible(true);

        //Líneas para obtener las familias de tipos de letra de java
        /*String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fontNames));*/
    }
} // fin de la clase EjemploMostrarColores2