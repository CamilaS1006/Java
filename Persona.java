public class Persona {
    String nombre;
    Double Altura;
    int NumCedula;

    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.nombre= "Camila";
        persona1.Altura= 1.68;
        persona1.NumCedula= 9867564;

        System.out.println("El nombre de persona1 es:" + persona1.nombre);
        System.out.println("La altura de persona1 es:" + persona1.Altura);
        System.out.println("La cedula de persona1 es:" + persona1.NumCedula);

        //********************** */

        Persona persona2= new Persona();
        persona2.nombre= "Mariana";
        persona2.Altura= 1.70;
        persona2.NumCedula= 8767564;

        System.out.println("El nombre de persona2 es:" + persona2.nombre);
        System.out.println("La altura de persona2 es:" + persona2.Altura);
        System.out.println("La cedula de persona2 es:" + persona2.NumCedula);

        //****************** */

        Persona persona3= new Persona();
        persona3.nombre= "Diana";
        persona3.Altura= 1.65;
        persona3.NumCedula= 87527508;

        System.out.println("El nombre de persona3 es:" + persona3.nombre);
        System.out.println("La altura de persona3 es:" + persona3.Altura);
        System.out.println("La cedula de persona3 es:" + persona3.NumCedula);





    }
}
