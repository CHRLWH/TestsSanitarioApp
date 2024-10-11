package modelo;

import java.util.List;

public class Pregunta extends Fichero {


    private String modulo;
    private String tema;
    private String pregunta;
    //Array de opciones
    private String [] opciones = new String[4];
    //Posicion donde está la respuesta correcta
    private String respuesta;

    public Pregunta() {


    }

    //Construir pregunta personalizada
    public Pregunta(String modulo, String pregunta, String tema, String[] opciones, String respuesta) {
        this.modulo = modulo;
        this.pregunta = pregunta;
        this.tema = tema;
        this.opciones = opciones;
        this.respuesta = respuesta;
    }



    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getPreguntaString() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String getRespuestaString() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}

