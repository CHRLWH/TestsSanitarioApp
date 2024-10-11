package modelo;

public class Pregunta extends Fichero {


    private String modulo;
    private String tema;
    private String pregunta;
    //Array de opciones
    private String [] opciones;
    //Posicion donde está la respuesta correcta
    private String respuesta;

    public Pregunta() {


    }
    //Construir pregunta sin respuesta
    public Pregunta(String modulo,String tema, String pregunta, String [] opciones) {
        this.modulo = leerFichero().get(0);
        this.tema = leerFichero().get(1);
        this.pregunta = leerFichero().get(2);
        this.opciones = new String[]{leerFichero().get(4),leerFichero().get(5),leerFichero().get(6),leerFichero().get(7)};

    }

    //Contruir respuesta
    public Pregunta(String respuesta){
        this.respuesta = leerFichero().get(3);
    }

    //Construir pregunta personalizada
    public Pregunta(String modulo, String pregunta, String tema, String[] opciones, String respuesta) {
        this.modulo = modulo;
        this.pregunta = pregunta;
        this.tema = tema;
        this.opciones = new String[4];
        this.respuesta = respuesta;
    }

    /*private Pregunta construirPreguntaConFichero(){
        for (int i = 0; i<leerFichero().size();i++){
                setModulo(leerFichero().get(i));
                i+=1;
                setPregunta(leerFichero().get(i));
                i+=1;
                setTema(leerFichero().get(i));
                i+=1;
        }
    }*/

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

