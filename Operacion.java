package Metodos;

import javax.swing.JOptionPane;

public class Operacion {
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplica;
    int division;
    //metodos
    //que el usuario pida por mensaje los numeros
    public void leerNumeros() {

        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
    }

        //metodo sumr
        public void sumar(){

            suma=num1+num2;
        }

            //metodo restar
            public void restar(){
                resta=num1-num2;
            }

                //metodo multiplicar
                public void multiplicar(){
                    multiplica=num1*num2;
                }
                
                //metodo division 
                public void division(){
                    division=num1/num2;
                }

                //metodo que muestre los resultados
                public void mostrarResultado(){
                    System.out.println("La suma de los dos numeros es de:" +suma);
                    System.out.println("La resta de los dos numeros es de:" +resta);
                    System.out.println("La multiplicacion de los dos numeros es de:" +multiplica);
                    System.out.println("La division de los dos numeros es de:" +division);
                }
}
