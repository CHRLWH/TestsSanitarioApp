package vista;
import java.util.Scanner;

public class Escanner {

    public static String pedirStringConMensaje (String mensaje){
        System.out.print(mensaje);
        String lector = new Scanner(System.in).nextLine();
        return lector;
    }

    public static String pedirStringSinMensaje (){
        String lector = new java.util.Scanner(System.in).nextLine();
        return lector;

    }

    public static int pedirNumeros(String mensaje){
        System.out.print(mensaje);
        int lector = new Scanner(System.in).nextInt();
        return lector;
    }
}
