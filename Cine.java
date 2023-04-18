package Tarea3;

public class Cine {
    String NomPelicula;
    String Categoria;
    int Precioentrada;

    public static void main(String[] args) {
        Cine cine1= new Cine();
        cine1.NomPelicula="Avatar";
        cine1.Categoria="Accion/Fantasia";
        cine1.Precioentrada=10500;

        System.out.println("Nombre de la pelicula: "+cine1.NomPelicula);
        System.out.println("Categoria:" +cine1.Categoria);
        System.out.println("Precio:" +cine1.Precioentrada);

        //********************************* */
        Cine cine2= new Cine();
        cine2.NomPelicula="Top gun";
        cine2.Categoria="Accion";
        cine2.Precioentrada=10500;

        System.out.println("Nombre de la pelicula: "+cine2.NomPelicula);
        System.out.println("Categoria:" +cine2.Categoria);
        System.out.println("Precio:" +cine2.Precioentrada);
        //******************************* */
        Cine cine3= new Cine();
        cine3.NomPelicula="Gato con botas";
        cine3.Categoria="Niños/Familiar";
        cine3.Precioentrada=10500;

        System.out.println("Nombre de la pelicula: "+cine3.NomPelicula);
        System.out.println("Categoria:" +cine3.Categoria);
        System.out.println("Precio:" +cine3.Precioentrada);
    }
}
