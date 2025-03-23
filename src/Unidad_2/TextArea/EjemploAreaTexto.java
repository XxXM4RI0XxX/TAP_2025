package Unidad_2.TextArea;

// Fig. 2.16: EjemploAreaTexto.java
// Prueba de AppAreaTexto.
import javax.swing.JFrame;

public class EjemploAreaTexto{
    public static void main(String[] args){
        AppAreaTexto appAreaTexto = new AppAreaTexto();
        appAreaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appAreaTexto.setSize(425, 200);
        appAreaTexto.setVisible(true);
    }
} // fin de la clase EjemploAreaTexto