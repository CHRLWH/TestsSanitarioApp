package modelo;

import java.io.*;
import java.util.ArrayList;

public class Fichero {

    private File fichero;

    public Fichero() {

    }

    public ArrayList <String> leerFichero(){

            String cadena="";
            int longitudDeLaCadena = 0;
            ArrayList<String> array = new ArrayList<String>();
            ArrayList <String> ficheroLeido = new ArrayList<String>();
            // Creo un objeto llamado lector de la clase FileReader vacío
            FileReader fichero = null;
            BufferedReader lector = null;

        //Posicion donde está la respuesta correcta



            try {
                //Creo el objeto FileReader con la ruta relativa del txt a leer
                fichero = new FileReader("data/preguntas.txt");
                lector = new BufferedReader(fichero);
                do {
                    cadena = lector.readLine();

                    if (cadena != null){
                        longitudDeLaCadena = cadena.length();

                        for (int i = 0; i < cadena.length(); i++) {

                            if (cadena.charAt(i) != ' ') {
                                ficheroLeido.add(cadena.substring(i));
                                i += longitudDeLaCadena;
                            }

                        }
                    }
                }while (cadena != null);



            } catch (FileNotFoundException e) {
                //Excepcion de fichero no encontrado
                System.out.println("[!]modelo.Fichero no encontrado");
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

