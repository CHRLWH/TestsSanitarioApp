public class Pregunta extends Fichero{


    private String modulo;
    private int tema;
    private String preguntas;
    //Array de opciones
    private String [] opciones;
    //Posicion donde está la respuesta correcta
    private int respuesta;
    public Pregunta(String modulo, int tema, String preguntas, int respuesta,String opciones) {
        this.modulo = modulo;
        this.tema = tema;
        this.preguntas = preguntas;
        this.respuesta = respuesta;
        this.opciones = new String[]{opciones};

    }
/*
    private Pregunta generarPregunta(){
        ; //CONSTRUIR PERSONA A PARTIR DEL FICHERO

        return Pregunta;
    }*/

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    /* private Pregunta crearPregunta(){
        String ficheroString = "";
        String formatoRegex = "[;]";
        Fichero fichero = new Fichero();
        ficheroString = fichero.leerFichero();

        ficheroString.split(formatoRegex);



    }*/
}

