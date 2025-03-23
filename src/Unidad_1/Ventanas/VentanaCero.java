package Unidad_1.Ventanas;

import javax.swing.JOptionPane;

public class VentanaCero {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bola mundo :D",
                "GUI.one",JOptionPane.ERROR_MESSAGE);

        String name = JOptionPane.showInputDialog(null,"De quien ere","nobre",JOptionPane.QUESTION_MESSAGE);

        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"De cuanto tiene?","eda"));
        //initialSelectionValue: Muestra un texto inicial en el apartado de Input

        JOptionPane.showMessageDialog(null,"Eri de "+ name + " y tiene "+ edad, "Info", JOptionPane.WARNING_MESSAGE);

    }

    /*
    JOptionPane.showMessageDialog( 'Objeto padre de la GUI' , 'Mensaje a mostrar' ,
                    'Titulo del cuadro' , 'Icono del cuadro');

    JOptionPane.showInputDialog... Capta la entrada del usuario, siempre regresa el dato en String

        Iconos:
        ERROR_MESSAGE (!) | INFORMATION_MESSAGE (¡) | WARNING_MESSAGE [!] | QUESTION_MESSAGE (?) | PLAIN_MESSAGE ()
     */


}
