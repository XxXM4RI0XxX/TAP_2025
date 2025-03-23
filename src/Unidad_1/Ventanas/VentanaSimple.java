package Unidad_1.Ventanas;

import javax.swing.*;
import java.awt.*;

public class VentanaSimple {
    // TODO. EN CADA APLICACION EXISTE MAXIMO SOLO 1 JFRAME
    public static void main(String[] args) {
        JFrame window = new JFrame(); //Crear una ventana simple

        // OJO: TODO. Para todo metodo SET, existe un metodo GET

        window.setBounds(400,400,600,400); //Declarar tamaño y ubicacion de la ventana

        window.setVisible(true); //Hacer la ventana visible

        window.setDefaultCloseOperation(3); // Operacion a realizar al momento de cerrar la ventana
        //0: Nada | 1: Esconder | 2: Dispose?? | 3: Cerrar ventana y terminar programa

        window.setResizable(false); // Declarar si se puede modificar el tamaño

        window.setTitle("Titulo chido xd"); // Titulo xd

        window.setLocation(new Point(400,300)); //Cambiar ubicacion ventana
        // new Point(), crear un punto xd [Necesario en casos mas avanzados creo xd]

        window.setLocationRelativeTo(null); //Ajustar ventana en medio de la pantalla :o

        window.setSize(new Dimension(700,900)); // Declarar nuevo tamaño de ventana
        // new Dimension(), otra manera de establecer las coordenadas xd

        window.setForeground(new Color(218, 13, 13)); //xd?

        window.setBackground(new Color(6, 63, 177)); // xd??

        window.setLayout(new FlowLayout()); // Layout para la ventana
        //Agregar componentes a la ventana, en este caso botones
        window.add(button1());
        window.add(button2());

        window.pack(); //Acomodar la ventana al tamaño de los componentes
    }

    // Botones :0
    public static JButton button1 (){
        JButton button = new JButton(); // Nuevo boton
        button.setText("Hola TQM :3"); // Texto del boton
        button.setBackground(new Color(87,35,100)); // Color del fondo
        button.setForeground(Color.WHITE); // Color del texto
        return button;
    }
    public static JButton button2 (){
        JButton button = new JButton();
        button.setText("Holi te AMo :3");
        button.setBackground(Color.WHITE);
        button.setForeground(new Color(87,35,100));
        return button;
    }
}
