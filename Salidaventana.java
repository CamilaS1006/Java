import javax.swing.JOptionPane;

public class Salidaventana {
    public static void main(String[]args){
        String cadena;
        int entero;
        char letra;
        cadena=JOptionPane.showInputDialog("Digite una cadena: ");
        entero= Integer.parseInt(JOptionPane.showInputDialog ("Digite un entero"));
        letra=JOptionPane.showInputDialog("Digite su letra: ").charAt(0);


        JOptionPane.showMessageDialog(null,"El numero entero es:" +entero);
        JOptionPane.showMessageDialog(null,"La cadena es;" +cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es:" +letra);
        

    }
}
