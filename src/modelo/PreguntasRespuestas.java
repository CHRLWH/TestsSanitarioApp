package modelo;

import controlador.Procesar;

import java.util.ArrayList;

public class PreguntasRespuestas extends Procesar {

    ArrayList <Pregunta> preguntas = new ArrayList <Pregunta>();

    ArrayList <Pregunta> respuestas = new ArrayList<Pregunta>();

    @Override
    public String toString() {
        return "PreguntasRespuestas{" +
                "preguntas=" + preguntas +
                ", respuestas=" + respuestas +
                '}';
    }

    public PreguntasRespuestas() {

        this.respuestas =  new ArrayList <Pregunta>();
        this.preguntas = getPreguntasProcesadas();


    }

}
