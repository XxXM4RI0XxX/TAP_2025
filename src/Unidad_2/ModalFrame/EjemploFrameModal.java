package Unidad_2.ModalFrame;
// Fig. 2.22: EjemploFrameModal.java
// Prueba de AppJFramePrincipal.
import javax.swing.JFrame;

public class EjemploFrameModal {
    public static void main(String[] args){
        AppJFramePrincipal appJFramePrincipal = new AppJFramePrincipal();
        appJFramePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appJFramePrincipal.setBounds(10,10,410,210); // establece tamaño y posición del marco
        appJFramePrincipal.setVisible(true);
    }
} //fin de la clase EjemploFrameModal