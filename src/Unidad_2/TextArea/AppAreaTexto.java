package Unidad_2.TextArea;
// Fig. 2.15: AppAreaTexto.java
// Copia el texto seleccionado de un área JText a otra.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AppAreaTexto extends JFrame{
    private final JTextArea areaTexto1; // muestra cadena de demostración
    private final JTextArea areaTexto2; // el texto resaltado se copia aquí
    private final JButton botonCopiar; // inicia el copiado de texto

    // constructor sin argumentos
    public AppAreaTexto(){
        super("Demostracion de JTextArea");
        Box cuadro = Box.createHorizontalBox(); // crea un cuadro
        String demo = """
                Esta es una cadena de
                demostracion para
                ilustrar como copiar texto
                de un area de texto a\s
                otra, usando un
                evento externo
                """;

        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1)); // agrega panel de desplazamiento

        botonCopiar = new JButton("Copiar >>>"); // crea botón para copiar
        cuadro.add(botonCopiar); // agrega botón de copia al cuadro
        botonCopiar.addActionListener(
                new ActionListener(){ // clase interna anónima
                    // establece el texto en areaTexto2 con el texto seleccionado de areaTexto1
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        areaTexto2.setText(areaTexto1.getSelectedText());
                    }
                });

        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2)); // agrega panel de desplazamiento

        add(cuadro); // agrega cuadro al marco
    }
} // fin de la clase AppAreaTexto