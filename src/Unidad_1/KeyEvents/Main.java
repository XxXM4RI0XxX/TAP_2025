package Unidad_1.KeyEvents;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        KeyDectector keyDectector = new KeyDectector();
        keyDectector.setBounds(new Rectangle(300,150));
        keyDectector.setLocationRelativeTo(null);
        keyDectector.setVisible(true);
        keyDectector.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
