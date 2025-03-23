package Unidad_2.MenuBar;
// Fig. 2.18: AppMenuBar.java
// Crea barra de menú en un marco y los items para manipularlo.
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class AppMenuBar extends JFrame implements ActionListener{

    private final JMenuBar menuBar; // barra que contiene los items del submenú
    private final JMenu menu1, menu2, menu3; // opciones del menú
    private final JMenuItem menuItem21, menuItem22, menuItem31, menuItem32, menuItem33; // opciones del submenú

    // constructor sin argumentos
    public AppMenuBar() {
        super("Demostracion de JMenuBar");
        setLayout(null);

        menuBar=new JMenuBar(); // crea la barra del menu
        setJMenuBar(menuBar); // agrega la barra al marco

        menu1=new JMenu("Opciones"); // crea la opción del menu
        menuBar.add(menu1); // agrega la opcion al menú

        // crea los dos submenús y agrega a la barra de menú
        menu2=new JMenu("Tamaño de la ventana");
        menu3=new JMenu("Color de fondo");
        menu1.add(menu2);
        menu1.add(menu3);

        // crea las opciones del primer submenú y agrega al submenú
        menuItem21=new JMenuItem("640*480");
        menuItem22=new JMenuItem("1024*768");
        menu2.add(menuItem21);
        menu2.add(menuItem22);

        // crea las opciones del segundo submenú y agrega al submenú
        menuItem31=new JMenuItem("Rojo");
        menuItem32=new JMenuItem("Verde");
        menuItem33= new JMenuItem("Blanco");
        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menu3.add(menuItem33);

        // registra componente de escucha
        menuItem21.addActionListener(this);
        menuItem22.addActionListener(this);
        menuItem31.addActionListener(this);
        menuItem32.addActionListener(this);
        menuItem33.addActionListener(this);
    }

    // maneja eventos de menú, definiendo la opción del submenú seleccionado
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==menuItem21) {
            setSize(640,480); // redimenciona marco
        }
        if (e.getSource()==menuItem22) {
            setSize(1024,768);
        }
        if (e.getSource()==menuItem31) {
            getContentPane().setBackground(new Color(255,0,0)); // cambia color de fondo del marco
        }
        if (e.getSource()==menuItem32) {
            getContentPane().setBackground(new Color(0,255,0));
        }
        if (e.getSource()==menuItem33)
            getContentPane().setBackground(new Color(255,255,255));
    }
} // fin de la clase AppMenuBar

