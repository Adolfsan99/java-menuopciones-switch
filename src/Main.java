import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        byte opcion = 0; /* toma numero y hace operacion*/
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("" +
                    "Menu principal \n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3.Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir"));
            float num1 = 0, num2 = 0, resultado = 0;
            switch (opcion) {
                case 1:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero"));
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es :" + resultado);
                    break;
                case 2:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero"));
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es:" + resultado);
                    break;
                case 3:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero"));
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la Multiplicacion es:" + resultado);
                    break;
                case 4:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero"));
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es:" + resultado);
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");

            }
        } while (opcion !=5) ;
        System.exit(0); /*finaliza programa 0= codigo de salida*/
    }
}