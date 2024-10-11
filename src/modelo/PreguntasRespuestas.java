package modelo;

import controlador.Procesar;

import java.util.ArrayList;
import java.util.Arrays;

public class PreguntasRespuestas extends Procesar {

    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

    ArrayList<Pregunta> respuestas = new ArrayList<Pregunta>();


    public PreguntasRespuestas() {
        this.respuestas = preguntas;
        this.preguntas = getPreguntasProcesadas();
    }

    public void mostrarListas() {
            for (Pregunta e : getPreguntasProcesadas()) {
                System.out.println(e.getModulo());
                System.out.println(e.getPreguntaString());
                System.out.println(e.getTema());
                System.out.println(Arrays.toString(e.getOpciones()));
                System.out.println(e.getRespuestaString());
                System.out.println(" ");
            }
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
}
