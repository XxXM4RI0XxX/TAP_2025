package Unidad_2.ModalFrame;
// Fig. 2.21: AppJDialogSecundaria.java
// Crea una ventana secundaria para mostrar una ventana padre JFrame.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class AppJDialogSecundaria extends JDialog implements ActionListener{

    private JButton boton2; // regresa al marco principal
    private JLabel label1; // texto indicativo de modal

    // Constructor que recibe el JFrame AppJFramePrincipal como parent y el modal
    public AppJDialogSecundaria(AppJFramePrincipal parent, boolean modal) {
        super(parent, modal);

        setLayout(null); // establece Layout absoluto
        setBounds(440,10,410,210); // Establece tamaño y posición del marco

        // crea las etiquetas y se agregan al contenedor
        label1 = new JLabel("Esta es la ventana secundaria");
        label1.setBounds(115,60,200,30);
        add(label1);

        // crea los botones y se agregan al contenedor
        boton2 = new JButton("Volver");
        boton2.setBounds(105,110,200,40);
        add(boton2);

        boton2.addActionListener(this); // registrar manejador de eventos
    }

    // maneja eventos de boton, cerrando la ventana secundaria
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            //Cerrar la ventana secundaria
            setVisible(false);
        }
    }
} //fin de la clase AppJDialogSecundaria