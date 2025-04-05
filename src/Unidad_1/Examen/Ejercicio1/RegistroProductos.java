package Unidad_1.Examen.Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegistroProductos extends JFrame {

    private final JTextField productName;
    private final JButton saveProduct;
    private JList<String> products;
    private ArrayList<String> listaxd = new ArrayList<>();

    public RegistroProductos(){
        super("Registro de productos");
        setLayout(new FlowLayout());

        productName = new JTextField("Nombre",20);
        add(productName);

        products = new JList<>();
        products.setVisibleRowCount(4);
        products.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(products));

        saveProduct = new JButton("Guardar");
        saveProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String product = productName.getText();
                listaxd.add(product);
                products.setListData(listaxd.toArray(new String[0]));
            }
        });
        add(saveProduct);

    }
}
