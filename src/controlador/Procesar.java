package controlador;

import modelo.Fichero;
import modelo.Pregunta;

import java.util.ArrayList;

public class Procesar extends Fichero {

    ArrayList <Pregunta> preguntas = new ArrayList<Pregunta>();
    public Procesar() {
        preguntas = procesar();
    }

    public ArrayList<Pregunta> procesar() {
        String moduloAux;
        String temaAux;
        String preguntaAux;
        String opcion1Aux;
        String opcion2Aux;
        String opcion3Aux;
        String opcion4Aux;
        String respuesta;

        ArrayList<String> lista = leerFichero();
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        int saltador = 8;
        int longitudArrayList = lista.size();
        //USO DEL CONTADOR MAL
        for (int i = 0; i < lista.size(); i++) {
            if (i)
            i*= saltador;
            moduloAux = String.valueOf(lista.get(i));
             temaAux = String.valueOf(lista.get(i+1));
             preguntaAux = String.valueOf(lista.get(i+2));
             opcion1Aux = String.valueOf(lista.get(i+3));
             opcion2Aux = String.valueOf(lista.get(i+4));
             opcion3Aux = String.valueOf(lista.get(i+5));
             opcion4Aux = String.valueOf(lista.get(i+6));
             respuesta = String.valueOf(lista.get(i+7));

            Pregunta praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
            preguntas.add(praux);
        }
        return preguntas;
    }

    public ArrayList<Pregunta> getPreguntasProcesadas() {
        return preguntas;
    }
}

