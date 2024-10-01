import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {

        public String leerFichero(){

            String cadena="";

            // Creo un objeto llamado lector de la clase FileReader vacío
            FileReader fichero = null;
            BufferedReader lector = null;


            try {
                //Creo el objeto FileReader con la ruta relativa del txt a leer
                fichero = new FileReader("data/preguntas.txt");
                lector = new BufferedReader(fichero);


                do {
                    cadena = lector.readLine();
                    if (cadena != null){
                       //Buscar almacenar cada palabra nueva no todo el texto
                    }
                }while (cadena != null);

            } catch (FileNotFoundException e) {
                //Excepcion de fichero no encontrado
                System.out.println("[!]Fichero no encontrado");
            } catch (IOException a){
                //Excepcion por fallo de lectura
                System.out.println("[!]Error de lectura");
            } catch (Exception u){
                //Excepcion para descubrir que excepcion ha sido la que ha ocasionado el problema
                System.out.println("[!]Error inesperado");
                //Printea la traza de la excepcion
                u.printStackTrace();
            }finally {
                //Si el lector ha leido algo se cierra
                try {
                    if (lector != null){
                        lector.close();
                    }
                    if (fichero != null) {
                        fichero.close();
                    }
                    //Si hay alguna excepcion printeo la traza para descubrir cual
                }catch (Exception a){
                    a.printStackTrace();
                }
            }

        }
}

