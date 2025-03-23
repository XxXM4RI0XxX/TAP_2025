package Unidad_2.FlowLayout;

// Fig. 2.7: EjemploFlowLayout.java
// Prueba AppFlowLayout.
import javax.swing.JFrame;

public class EjemploFlowLayout{
    public static void main(String[] args){
        AppFlowLayout appFlowLayout = new AppFlowLayout();
        appFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFlowLayout.setSize(400, 75);
        appFlowLayout.setVisible(true);
    }
} //