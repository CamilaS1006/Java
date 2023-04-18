package Tarea3;
public class Listmercado {
    String nombre;
    int precio;
    int suma;

    public static void main(String[] args) {
        Listmercado Listmercado1= new Listmercado();
        Listmercado1.nombre="Tomate";
        Listmercado1.precio=300;

       //****************** */
        Listmercado Listmercado2= new Listmercado();
        Listmercado2.nombre="pollo";
        Listmercado2.precio=15000;

        //***************** */
        Listmercado Listmercado3= new Listmercado();
        Listmercado3.nombre="jugo de naranja";
        Listmercado3.precio=12000;
        //****************** */
        Listmercado Listmercado4= new Listmercado();
        Listmercado4.nombre="frijoles";
        Listmercado4.precio=9000;
        //************************** */
         Listmercado Listmercado5= new Listmercado();
        Listmercado5.nombre="queso";
        Listmercado5.precio=10000;

        suma=Listmercado1.precio+Listmercado2.precio+Listmercado3.precio+Listmercado4.precio+Listmercado5.precio;


        System.out.println("la lista de mercado es:" +Listmercado1.nombre+"  "+Listmercado2.nombre+"  "+Listmercado3.nombre+"  "+Listmercado4.nombre" "+Listmercado5.nombre);

        System.out.println("Total a pagar del mercado es:"+suma);
    






    }
}
