import java.util.ArrayList;
import java.util.Objects;

public class PreguntasRespuestas {

    ArrayList <Pregunta> preguntas = new ArrayList <Pregunta>();
    ArrayList <Respuesta> respuestas = new ArrayList<Respuesta>();

    public PreguntasRespuestas() {
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreguntasRespuestas that = (PreguntasRespuestas) o;
        return Objects.equals(preguntas, that.preguntas) && Objects.equals(respuestas, that.respuestas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preguntas, respuestas);
    }
}
