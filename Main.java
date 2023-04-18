package Metodos;

public class Main {
    public static void main(String[] args) {//aqui es donde se activa todod lo referente a la programacion
        Operacion op=new Operacion();//se crea un objeto op de la clase operacion
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.division();
        op.mostrarResultado();

        //*********************** */
        Operacion op1=new Operacion();//se crea un objeto op de la clase operacion
        op1.leerNumeros();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.division();
        op1.mostrarResultado();
    }
}
