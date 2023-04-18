public class Coche{
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1= new Coche();//creamos un objeto
        coche1.color="rojo";
        coche1.marca="Honda";
        coche1.km=0;

        System.out.println("El color del coche1 es:" + coche1.color);
        System.out.println("La marca del coche1 es:" + coche1.marca);
        System.out.println("El kilometraje del coche1 es:" + coche1.km);


        //*********** */
        Coche coche2= new Coche();//creamos un objeto
        coche2.color="blanco";
        coche2.marca="Audi";
        coche2.km=100;

        System.out.println("El color del coche2 es:" + coche2.color);
        System.out.println("La marca del coche2 es:" + coche2.marca);
        System.out.println("El kilometraje del coche2 es:" + coche2.km);
    }
}