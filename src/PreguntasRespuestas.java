import java.util.ArrayList;
import java.util.Objects;

public class PreguntasRespuestas extends Pregunta{

    ArrayList <Pregunta> preguntas = new ArrayList <Pregunta>();

    ArrayList <Pregunta> respuestas = new ArrayList<Pregunta>();

    public PreguntasRespuestas() {
        this.respuestas =  new ArrayList <Pregunta>();
        this.preguntas = new ArrayList<Pregunta>();

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
