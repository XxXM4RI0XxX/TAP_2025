package Unidad_2.ModalFrame;
// Fig. 2.20: AppJFramePrincipal.java
// Crea un marco principal para mostrar una ventana secundaria o modal.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppJFramePrincipal extends JFrame implements ActionListener{

    private JButton boton1; // botón que desplegará la ventana secundaria
    private JLabel label1; // etiqueta de descripción de acción

    // Constructor sin argumentos
    public AppJFramePrincipal() {
        super("Demostración de una ventana secundaria o modal");

        setLayout(null); // establece Layout absoluto

        setResizable(false); // establece marco no redimensionable

        // crea la etiqueta y se agrega al contenedor
        label1 = new JLabel("Esta es la ventana principal");
        label1.setBounds(115,60,200,30);
        add(label1);

        // crea el botón y se agrega al contenedor
        boton1 = new JButton("Haz clic aquí");
        boton1.setBounds(105,110,200,40);
        add(boton1);

        boton1.addActionListener(this); // registra componente de escucha
    }

    // maneja eventos de boton, mostrando la secunda ventana (modal)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            // Inicializa y muestra la segunda ventana con los argumentos this (JFrame) y true (modal)
            AppJDialogSecundaria secundaria = new AppJDialogSecundaria(this,true);
            secundaria.setVisible(true);
        }
    }
} //fin de la clase AppJFramePrincipal