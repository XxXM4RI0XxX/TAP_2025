package Unidad_1.NiceCalc;

import javax.swing.*;

public class Calculadora {

    public void calcPrim (){

        Object oper = JOptionPane.showInputDialog(null,"Operacion a realizar","Oper",
                JOptionPane.QUESTION_MESSAGE,new ImageIcon("C:\\Users\\monte\\IdeaProjects\\EDDRep\\src\\Util\\tether_usdt_crypto_icon_264385.png"),
                new Object[] {"Suma","Resta"},"Suma");

        String val1 = JOptionPane.showInputDialog(null,"Ingrese primer numero",oper.toString(),1);
        String val2 = JOptionPane.showInputDialog(null,"Ingrese segundo numero",oper.toString(),1);

        int a = Integer.parseInt(val1);
        int b = Integer.parseInt(val2);
        int res;

        if(oper.toString().equals("Suma")){
            JOptionPane.showMessageDialog(null,"Resultado de "+ oper.toString()+ ": "+ (a+b),"Resultado",0);
        } else{
            JOptionPane.showMessageDialog(null,"Resultado de "+ oper.toString()+ ": "+ (a-b),"Resultado",0);
        }
    }

    public void propCalc(){

        Object propina = JOptionPane.showInputDialog(null,"Propina a dar [%]","Propina",
                JOptionPane.QUESTION_MESSAGE,new ImageIcon("C:\\Users\\monte\\IdeaProjects\\EDDRep\\src\\Util\\tether_usdt_crypto_icon_264385.png"),
                new Object[] {10,5,20,"Otra"},"Otra");

        int total;

        if(propina.toString().equals("Otra")){
            propina = JOptionPane.showInputDialog(null,"Ingrese propina [%]","Otra",1);
        }

        total = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese monto consumido",propina.toString()+"%",1));

        float prop = Float.parseFloat(propina.toString())/100;
        float res = total+(total*prop);

        JOptionPane.showMessageDialog(null,"Monto: $"+total+"\nPropina dada "+propina.toString()+"%\n"+"Total: $"+res,"Total",2);

        }
    }
