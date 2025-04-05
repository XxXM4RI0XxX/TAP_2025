package Unidad_2.Calculadora.Simple;

import MyLibraries.LibreriaCalculadora.Calculadora;

import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {

        Object[] options = new Object[]{"+","-","*","/","^","sqrt","NSqurt","log","|x|"};

        float val1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor 1","Calculadora",JOptionPane.QUESTION_MESSAGE));

        Object operator = JOptionPane.showInputDialog(null,"Elija operacion","Operador",JOptionPane.WARNING_MESSAGE,null,options,"Choose");

        double result = 0;

        if(operator=="sqrt" || operator=="log" || operator=="abs"){
            switch (String.valueOf(operator)){
                case "sqrt" -> result = Calculadora.squareRoot(val1);
                case "log" -> result = Calculadora.log10(val1);
                case "abs" -> result = Calculadora.abs(val1);
            }
        }else {
            float val2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor 2","Calculadora",JOptionPane.QUESTION_MESSAGE));

            switch (String.valueOf(operator)){
                case "+" -> result = Calculadora.addition(val1,val2);
                case "-" -> result = Calculadora.substraction(val1,val2);
                case "*" -> result = Calculadora.multiplication(val1,val2);
                case "/" -> result = Calculadora.division(val1,val2);
                case "^" -> result = Calculadora.power(val1,val2);
                case "NSqrt" -> result = Calculadora.nRoot(val1,val2);
            }
        }

        JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f",result),"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }

}
