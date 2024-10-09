import java.util.ArrayList;
import java.util.Objects;

public class PreguntasRespuestas extends Pregunta{

    ArrayList <Pregunta> preguntas = new ArrayList <Pregunta>();

    ArrayList <Pregunta> respuestas = new ArrayList<Pregunta>();

    public PreguntasRespuestas() {
        this.respuestas =  new ArrayList <Pregunta>();
        this.preguntas = new ArrayList<Pregunta>();

        respuestas.add(getPregunta());
        preguntas.add(getRespuesta());

    }

    public Pregunta getPregunta(){
        return new Pregunta(getModulo(),getTema(),getPreguntaString(),getOpciones());
    }
    public Pregunta getRespuesta(){
        return new Pregunta(getRespuestaString());
    }


}
