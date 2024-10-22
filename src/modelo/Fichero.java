package modelo;

import controlador.Procesar;

import java.io.*;
import java.util.ArrayList;

public class Fichero {

    private File fichero;

    public Fichero() {

    }

    public ArrayList<String> leerFichero(String ficheroALeer) {

        String cadena = "";
        int longitudDeLaCadena = 0;
        ArrayList<String> ficheroLeido = new ArrayList<String>();
        // Creo un objeto llamado lector de la clase FileReader vacío
        FileReader fichero = null;
        BufferedReader lector = null;


        try {
            //Creo el objeto FileReader con la ruta relativa del txt a leer
            fichero = new FileReader(ficheroALeer);
            lector = new BufferedReader(fichero);
            do {
                cadena = lector.readLine();

                if (cadena != null) {
                    longitudDeLaCadena = cadena.length();

                    for (int i = 0; i < cadena.length(); i++) {

                        if (cadena.charAt(i) != ' ') {
                            ficheroLeido.add(cadena.substring(i));
                            i += longitudDeLaCadena;
                        }

                    }
                }
            } while (cadena != null);


        } catch (FileNotFoundException e) {
            //Excepcion de fichero no encontrado
            System.out.println("[!]modelo.Fichero no encontrado");
        } catch (IOException a) {
            //Excepcion por fallo de lectura
            System.out.println("[!]Error de lectura");
        } catch (Exception u) {
            //Excepcion para descubrir que excepcion ha sido la que ha ocasionado el problema
            System.out.println("[!]Error inesperado");
            //Printea la traza de la excepcion
            u.printStackTrace();
        } finally {
            //Si el lector ha leido algo se cierra
            try {
                if (lector != null) {
                    lector.close();
                }
                if (fichero != null) {
                    fichero.close();
                }
                //Si hay alguna excepcion printeo la traza para descubrir que excepcion es
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        return ficheroLeido;
    }

    public void escribirFicheroNuevo(String rutaDeFicheroAescribir, StringBuilder textoAEscribir) {

        FileWriter ficheroAescribir = null;

        try {
            ficheroAescribir = new FileWriter(rutaDeFicheroAescribir);
            ficheroAescribir.write(String.valueOf(textoAEscribir));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (ficheroAescribir != null) {
                    ficheroAescribir.close();
                } else {
                    System.out.println("No se ha encontrado ningun fichero");
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }

    }

    public static void escribirFicheroExistente(String rutaDeFicheroAescribir, String textoAEscribir) {

        FileWriter ficheroAescribir = null;

        try {
            ficheroAescribir = new FileWriter(rutaDeFicheroAescribir, true);
            ficheroAescribir.write(textoAEscribir);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (ficheroAescribir != null) {
                    ficheroAescribir.close();
                } else {
                    System.out.println("No se ha encontrado ningun fichero");
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }

    }

}

