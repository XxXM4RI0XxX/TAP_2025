package Unidad_2.Calculadora.Frame;

import AMDCalculator.Calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private static JTextArea problemArea = new JTextArea("uwu", 1,50);
    private static JButton one, two, three, four, five, six, seven ,eight, nine, zero, dot, plus, minus, div, mult, pow,
        squareSqrt, nSqrt, log, equal, clear, backspace;
    private final static JButton[] numbers = {one,two,three,four,five,six,seven,eight,nine,zero,dot};
    private final static JButton[] operators = {plus,minus,div,mult,pow,nSqrt};
    private static String problemText = "";

    public MainFrame(){
        super("Calculadora chida");
        setLayout(new GridLayout(5,5));

        String[] numberTags = {"1","2","3","4","5","6","7","8","9","0","."};
        String[] operatorsTags = {"+","-","/","*","^","n?"};

        problemArea.setEditable(false);
        add(problemArea);

        clear = new JButton("AC");
        add(clear);
        clear.addActionListener(this);

        backspace = new JButton("<-");
        add(backspace);
        backspace.addActionListener(this);

        for (int i = 0; i < numberTags.length; i++) {
            numbers[i] = new JButton(numberTags[i]);
            add(numbers[i]);
            numbers[i].addActionListener(this);
        }

        for (int i = 0; i < operatorsTags.length; i++) {
            operators[i] = new JButton(operatorsTags[i]);
            add(operators[i]);
            operators[i].addActionListener(this);
        }

        squareSqrt = new JButton("?");
        add(squareSqrt);
        squareSqrt.addActionListener(this);

        log = new JButton("log");
        add(log);
        log.addActionListener(this);

        equal = new JButton("=");
        add(equal);
        equal.addActionListener(this);
    }

    private static double calculate(double a, String operator){

        double res = 0;

        switch (operator){
            case "" -> res = a;
            case "log" -> res = Calculate.log10(a);
            case "?" -> res = Calculate.squareRoot((float) a);
        }

        return res;
    }

    private double calculate(double x, double y,String operator){

        double res = 0;

        switch (operator){
            case "+" ->{
                res = Calculate.addition((float)x,(float)y);
            }
            case "-" ->{
                res = Calculate.substraction((float)x,(float)y);
            }
            case "*" ->{
                res = Calculate.multiplication((float)x,(float)y);
            }
            case "/" ->{
                res = Calculate.division((float)x,(float)y);
            }
            case "^" ->{
                res = Calculate.power((float)x,(float)y);
            }
            case "n?" ->{
                res = Calculate.nRoot((float)x,(float)y);
            }
            case "" ->{res = 0;}
        }

        return res;
    }

    private double a; //Valor 1
    private double b; //Valor 2
    private String lastOperator = ""; //Guarda el ultimo operador, esto para poder usar "=" al inicio
    private boolean nextOperation = false; //Revisa si ya fue hecha una primera operacion, para activar la autooperacion de valores
    private static String number = "";

    @Override
    public void actionPerformed(ActionEvent e) {

        for(JButton source : operators){ //Cuando un operador es elegido
            if(e.getSource() == source){
                if(!nextOperation){
                    if(number.isEmpty()) //Verifica si el primer valor elegido es un operador en vez de un numero
                        a = 0;
                    else
                        a = Integer.parseInt(number); //Asigna el primer valor
                    //Cuando un siguiente operador sea elegido, en vez de "="
                }else{
                    if(number.isEmpty()) //Verifica si el primer valor elegido es un operador en vez de un numero
                        if(source.getText().equals("+") || source.getText().equals("-"))
                            b = 0; //Asigna valores
                        else b = 1;
                    else
                        b = Double.parseDouble(number); //Asigna el primer valor
                    a = calculate(a,b, lastOperator);
                    problemText = String.valueOf(a);
                }
                problemText = problemText.concat("\n" + source.getText() + " "); //Se escribe una nueva linea para el siguiente valor
                nextOperation = true;
                number = ""; //Reinicia el valor del numero a cero
                lastOperator = source.getText();
                problemArea.setText(problemText);
                break;
            }
        }
        for(JButton source : numbers){ //Cuando un numero es elegido
            if(e.getSource() == source){
                number = number.concat(source.getText()); //Se guarda el numero en una cadena aparte de la mostrada en pantalla
                problemText = problemText.concat(source.getText()); //Actualiza el area de formula con cada clic de boton
                problemArea.setText(problemText);
                if(!nextOperation)
                    a = Integer.parseInt(number);
                else b = Integer.parseInt(number);
                break;
            }
        }
        if(e.getSource() == log){ //Cuando es elegida la operacion logaritmo
            a = calculate(a,"log");
            problemText = String.valueOf(a);
            problemArea.setText(problemText);
            nextOperation = true;
        }
        if(e.getSource() == squareSqrt){ //Cuando es elegida la raiz cuadrada
            a = calculate(a,"?");
            problemText = String.valueOf(a);
            problemArea.setText(problemText);
            nextOperation = true;
        }
        if(e.getSource() == equal) { //Cuando es presionado "="
            if(number.isEmpty()) //Si solo un valor fue ingresado
                a = calculate(a,lastOperator);
            else{
                b = Double.parseDouble(number); //Si el segundo valor fue ingresado
                a = calculate(a,b,lastOperator);
            }
            nextOperation = false;
            problemArea.setText(String.valueOf(a));
        }
        if(e.getSource() == clear) { //Reinicia la cuenta
            problemText = "";
            problemArea.setText(problemText);
            a = 0;
        }
        if(e.getSource() == backspace){
            if(!problemText.isEmpty() && !number.isEmpty()){ //Verifica si realmente hay algo para borrar
                number = number.substring(0, number.length()-1); //Borra el valor numerico
                problemText = problemText.substring(0, problemText.length()-1); //borra el area del problema
                try {
                    if (!nextOperation)
                        a = Double.parseDouble(number);
                    else b = Double.parseDouble(number);
                }catch (NumberFormatException _){
                    if (!nextOperation)
                        a = 0;
                    else {
                        if(lastOperator.equals("+") || lastOperator.equals("-"))
                            b = 0; //Asigna valores
                        else b = 1;
                    }
                }
            }
            problemArea.setText(problemText);
        }

    }
}
