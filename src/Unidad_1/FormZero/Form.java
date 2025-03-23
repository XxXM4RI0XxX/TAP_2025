package Unidad_1.FormZero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Form extends JFrame { // Al agregar extends JFrame, hacemos que la clase en sí se convierta en la ventana

    // Creacion de componentes (Campos de texto en este caso)
    private final JTextField maternalSurname;
    private final JTextField paternalSurname;
    private final JTextField name;
    private final JTextField secondName;
    private final JTextField age;
    private final JTextField CURP;
    private final JTextField RFC;


    public Form() {
        super("Formulario xd"); //El super hereda el atributo "title" de JFrame
        setLayout(new FlowLayout());// Acomodo que seguiran los componentes que se mostraran
        //Una opcion que probe:
        //setLayout(new GridLayout(4,2));
        //Hace que los componentes visibles se acomoden en '4' filas, con '2' columnas (Activar form.pack(); en Main para ver bien los resultados)

        //Declarar y agregar componentes al JFrame/////////////
        //Campos de texto

        JTextField[] descriptions = {new JTextField("Apellido paterno*"),new JTextField("Apellido materno*"),new JTextField("Nombre*"),
        new JTextField("Segundo nombre"), new JTextField("Edad*"), new JTextField("CURP*"), new JTextField("RFC*")};

        for(JTextField jf : descriptions){
            jf.setEditable(false);
        }

        add(descriptions[0]);
        paternalSurname = new JTextField(20);
        add(paternalSurname);

        add(descriptions[1]);
        maternalSurname = new JTextField(20); // JTextField("Texto por defecto",Tamaño del campo);
        add(maternalSurname); // Agrega el JTextField (componente) al JFrame (ventana)

        add(descriptions[2]);
        name = new JTextField(22);
        add(name);

        add(descriptions[3]);
        secondName = new JTextField(22);
        add(secondName);

        add(descriptions[4]);
        age = new JTextField(3);
        add(age);

        add(descriptions[5]);
        CURP = new JTextField(15);
        add(CURP);

        add(descriptions[6]);
        RFC = new JTextField(12);
        add(RFC);

        //Crear el manejador de eventos para agregarle componentes posibles de crear eventos
        //Todo componente que se quiera que funcione como evento, se tiene que añadir al ActionListener
        FormHandler handler = new FormHandler();
        paternalSurname.addActionListener(handler);
        maternalSurname.addActionListener(handler);
        name.addActionListener(handler);
        secondName.addActionListener(handler);
        age.addActionListener(handler);
        CURP.addActionListener(handler);
        RFC.addActionListener(handler);

    }

    // Creacion de clase manejadora de eventos, para declarar que hacer en caso de que un componente cree un evento
    private class FormHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {//Metodo implementado de ActionListener para detectar que tipo de evento ocurre
            int ag=0;
            String msurname="", psurname="", nm="", curp="", rfc="";

                try {
                    ag = Integer.parseInt(age.getText());
                    if (ag < 18 || ag >= 130)
                        throw new NumberFormatException();

                     msurname = maternalSurname.getText();
                     psurname = paternalSurname.getText();
                     nm = name.getText();
                     String secname = secondName.getText();
                     curp = CURP.getText();
                     rfc = RFC.getText();

                    if(msurname.isEmpty() || psurname.isEmpty() || nm.isEmpty() || curp.isEmpty() || rfc.isEmpty())
                        throw new NumberFormatException();

                    JOptionPane.showMessageDialog(null, String.format("""
                            >>>> Datos introducidos <<<<
                            Nombre completo: %s %s %s %s
                            Edad: %d
                            CURP: %s
                            RFC: %s""", nm, secname, psurname, msurname, ag, curp, rfc), "\t>> Informacion recibida <<", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException _) {
                    if(ag > 0 && ag < 18)
                    JOptionPane.showMessageDialog(null, "Edad minima requerida: 18", "Error 401", JOptionPane.ERROR_MESSAGE);
                    else if(msurname.isEmpty() || psurname.isEmpty() || nm.isEmpty() || curp.isEmpty() || rfc.isEmpty())
                        JOptionPane.showMessageDialog(null,"Llenar campos obligatorios! [*]","Error 403",JOptionPane.ERROR_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "Edad invalida", "Error 402", JOptionPane.ERROR_MESSAGE);
                }
        }
    }

}
