package modelo;

import java.util.ArrayList;

public class PreguntasRespuestas extends Pregunta {

    ArrayList <Pregunta> preguntas = new ArrayList <Pregunta>();

    ArrayList <Pregunta> respuestas = new ArrayList<Pregunta>();

    public PreguntasRespuestas() {
        super();
        this.respuestas =  new ArrayList <Pregunta>();
        this.preguntas = ;

    }

    public Pregunta getPregunta(){
        Pregunta preguntaAuxiliar = new Pregunta(getModulo(),getTema(),getPreguntaString(),getOpciones());
        return preguntaAuxiliar;
    }
    public Pregunta getRespuesta(){
        Pregunta respuestaAuxiliar = new Pregunta(getRespuestaString());
        return respuestaAuxiliar;
    }

    public ArrayList<Pregunta> getPreguntasN() {
        respuestas.add(getPregunta());
        return preguntas;
    }

    public ArrayList<Pregunta> getRespuestas() {
        preguntas.add(getRespuesta());
        return respuestas;
    }
}
