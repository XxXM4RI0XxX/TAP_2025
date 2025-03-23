package Unidad_1.U1_Proyect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsFunction {

    private static JButton addContact = new JButton("Add Contact");
    private static JDialog addContactDialog = CustomCreator.customDialog(null,"Add Contact",
            new Rectangle(300,500),null);

    public static void setEverything(){



        addContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    private void setAddContactDialog(){
        //ArrayList con todas las descripciones, todas tienen tamaño 20
        JTextField[] descriptions = {new JTextField("Name",20),new JTextField("Nick Name",20),new JTextField("Area Code",20),
                new JTextField("Phone",20), new JTextField("E-mail",20), new JTextField("Social Media",20)};
        //Declarar todas las descripciones como no editables
        for(JTextField textField : descriptions)
            textField.setEditable(false);

        
    }

}
