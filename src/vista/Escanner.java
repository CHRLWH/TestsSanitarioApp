package vista;
import java.io.IOException;
import java.util.Scanner;

public class Escanner {

    public static String pedirStringConMensaje (String mensaje){
        System.out.println(mensaje);
        String lector = new Scanner(System.in).nextLine();

        return lector;
    }

    public static String pedirStringSinMensaje (){
        String lector = new java.util.Scanner(System.in).nextLine();
        return lector;

    }

    public static int pedirNumeros(String mensaje){
        System.out.println(mensaje);
        int lector = new Scanner(System.in).nextInt();
        return lector;
    }

    public static double pedirConDecimales(String mensaje){
        System.out.println(mensaje);
        double numeroConDecimales =  new Scanner(System.in).nextInt();
        return numeroConDecimales;
    }
}
