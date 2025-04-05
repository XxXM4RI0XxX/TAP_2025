package Unidad_2.Calculadora;

import Unidad_2.Calculadora.Frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        MainFrame frame = new MainFrame();
        frame.setBounds(new Rectangle(400,600));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }

}
