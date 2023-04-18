import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        //scanner importa una libreria, capaz de hacer que el programa funcione
        Scanner entrada=new Scanner(System.in);
        float numero2;
        System.out.println("digite el numero");
        numero2=entrada.nextFloat();
        System.out.println("El numero es:" +numero2);

        Scanner entrada1=new Scanner(System.in);
        int numero3;
        System.out.println("digite el numero");
        numero3=entrada1.nextInt();
        System.out.println("El numero es:" +numero3);

        Scanner entrada2=new Scanner(System.in);
        double numero4;
        System.out.println("digite el numero");
        numero4=entrada2.nextDouble();
        System.out.println("El numero es:" +numero4);


        Scanner entrada3=new Scanner(System.in);
        String cadena;
        System.out.println("digite la cadena de caracteres");
        cadena=entrada3.nextLine();
        System.out.println("la cadena es:" +cadena);

        //constante

        String palabra="Hola como estas?";


    }
}
