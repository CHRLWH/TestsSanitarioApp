import java.io.*;
import java.util.ArrayList;

public class Fichero {

    private File fichero;

    public Fichero() {

    }

    public ArrayList <String> leerFichero(){

            String cadena="";
            String disparador = "MODULO";
            int longitudDeLaCadena = 0;
            ArrayList <String> ficheroLeido = new ArrayList<String>();
            // Creo un objeto llamado lector de la clase FileReader vacío
            FileReader fichero = null;
            BufferedReader lector = null;


            try {
                //Creo el objeto FileReader con la ruta relativa del txt a leer
                fichero = new FileReader("data/preguntas.txt");
                lector = new BufferedReader(fichero);

                //Hacer que cuando la cadena sea MODULO se haga un objeto nuevo

                do {
                    cadena = lector.readLine();

                    if (cadena != null){
                            if (cadena.equalsIgnoreCase(disparador)) {
                                longitudDeLaCadena = cadena.length();

                                for (int i = 0; i < cadena.length(); i++) {

                                    if (cadena.charAt(i) != ' ') {
                                        ficheroLeido.add(cadena.substring(i));
                                        i += longitudDeLaCadena;
                                    }

                                }
                            }else{
                                cadena = null;
                            }
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
                    //Si hay alguna excepcion printeo la traza para descubrir que excepcion es
                }catch (Exception a){
                    a.printStackTrace();
                }
            }
            return ficheroLeido;
        }

    public void escribirFichero(String textoAEscribir){
        FileWriter ficheroAescribir = null;

        try{
            ficheroAescribir = new FileWriter("data/ficheroPrueba.txt");

            ficheroAescribir.write(textoAEscribir);
            ficheroAescribir.write(97); //Escribe el caracter 97 de la tabla ascii
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            try{
                if (ficheroAescribir != null){
                    ficheroAescribir.close();
                }else{
                    System.out.println("No se ha encontrado ningun fichero");
                }
            }catch (Exception a){
                a.printStackTrace();
            }
        }

        }

}

