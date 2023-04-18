import java.util.Scanner;
public class tarea2{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,triangulo;
        System.out.println("Digite 2 numeros");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        triangulo=num1 * num2/2;
        
        System.out.println("El area del triangulo es:" +triangulo);
        

        double radio,area;
        final double PI = 3.1416;
        System.out.println("Escriba el valor del radio");
        radio=entrada.nextFloat();
        //devuelve la base elevada al exponente , esto es, baseexponente
        area=PI * Math.pow(radio, 2);

        System.out.println("El valor del area del circulo es:" +area);


        int lado1,lado2,cuadrado;
        System.out.println("Escriba el valor de lado1 y lado2");
        lado1=entrada.nextInt();
        lado2=entrada.nextInt();
        cuadrado=lado1 * lado2;

        System.out.println("El valor del area del cuadrado es:" +cuadrado);

        int lado3,ancho,rectangulo;
        System.out.println("Escriba el valor del lado y ancho");
        lado3=entrada.nextInt();
        ancho=entrada.nextInt();
        rectangulo= lado3 * ancho;

        System.out.println("El area del rectangulo es:" +rectangulo);

    }

}