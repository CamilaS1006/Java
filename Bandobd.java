package Tarea3;

public class Bandobd {
    String Nombanco;
    String NomUsuario;
    int Numcuenta;
    String TipoCuenta;
    int NumTelefono;

    public static void main(String[] args) {
        Bandobd banco1= new Bandobd();
        banco1.Nombanco= "Bancolombia";
        banco1.NomUsuario= "Sofia";
        banco1.Numcuenta= 9867564;
        banco1.TipoCuenta="Ahorros";
        banco1.NumTelefono=579872845;

        System.out.println("El nombre del banco es es:" +banco1.Nombanco);
        System.out.println("El nombre de usuario es :" +banco1.NomUsuario);
        System.out.println("El numero de cuenta es :" +banco1.Numcuenta);
        System.out.println("El tipo de cuenta es :" +banco1.TipoCuenta);
        System.out.println("El numero de telefono es:" +banco1.NumTelefono);
        
        //********************************** */
        Bandobd banco2= new Bandobd();
        banco2.Nombanco= "VVVA";
        banco2.NomUsuario= "Marcela";
        banco2.Numcuenta= 98674564;
        banco2.TipoCuenta="Ahorros";
        banco2.NumTelefono=579879865;

        System.out.println("El nombre del banco es es:" +banco2.Nombanco);
        System.out.println("El nombre de usuario es :" +banco2.NomUsuario);
        System.out.println("El numero de cuenta es :" +banco2.Numcuenta);
        System.out.println("El tipo de cuenta es :" +banco2.TipoCuenta);
        System.out.println("El numero de telefono es:" +banco2.NumTelefono);

        //********************************************* */
        Bandobd banco3= new Bandobd();
        banco3.Nombanco= "Avevillas";
        banco3.NomUsuario= "Mara";
        banco3.Numcuenta= 986242;
        banco3.TipoCuenta="Corriente";
        banco3.NumTelefono=3535357;

        System.out.println("El nombre del banco es es:" +banco3.Nombanco);
        System.out.println("El nombre de usuario es :" +banco3.NomUsuario);
        System.out.println("El numero de cuenta es :" +banco3.Numcuenta);
        System.out.println("El tipo de cuenta es :" +banco3.TipoCuenta);
        System.out.println("El numero de telefono es:" +banco3.NumTelefono);

    }
}
