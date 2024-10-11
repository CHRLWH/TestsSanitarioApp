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
        ArrayList<String> lista = leerFichero();
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        int saltador = leerFichero().size() * 8;
        int longitudArrayList = lista.size();
        for (int i = 0; i < lista.size(); i++) {
            String moduloAux = String.valueOf(lista.get(i));
            i++;
            String temaAux = String.valueOf(lista.get(i));
            i++;
            String preguntaAux = String.valueOf(lista.get(i));
            i++;
            String opcion1Aux = String.valueOf(lista.get(i));
            i++;
            String opcion2Aux = String.valueOf(lista.get(i));
            i++;
            String opcion3Aux = String.valueOf(lista.get(i));
            i++;
            String opcion4Aux = String.valueOf(lista.get(i));
            i++;
            String respuesta = String.valueOf(lista.get(i));

            Pregunta praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
            preguntas.add(praux);
        }
        return preguntas;
    }

    public ArrayList<Pregunta> getPreguntasProcesadas() {
        return preguntas;
    }
}

