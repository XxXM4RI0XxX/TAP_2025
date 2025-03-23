package Unidad_1.U1_Proyect;

import javax.swing.*;
import java.awt.*;

public class CustomCreator {

    public static JDialog customDialog(JFrame owner, String title, Rectangle size, Color background){

        JDialog dialog = new JDialog(owner,title);
        dialog.setBounds(size);
        dialog.setBackground(background);
        dialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
        return dialog;
    }

    public static JButton customButton(String title, Color color, Font font){

        JButton button = new JButton(title);
        button.setBackground(color);
        if(font != null)
            button.setFont(font);

        return button;
    }

}
