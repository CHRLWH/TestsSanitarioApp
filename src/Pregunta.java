public class Pregunta extends Fichero{


    private String modulo;
    private String tema;
    private String pregunta;
    //Array de opciones
    private String [] opciones;
    //Posicion donde está la respuesta correcta
    private String respuesta;
    public Pregunta() {
        this.modulo = leerFichero().get(0);
        this.tema = leerFichero().get(1);
        this.pregunta = leerFichero().get(2);
        this.respuesta = leerFichero().get(3);
        this.opciones = new String[]{leerFichero().get(4),leerFichero().get(5),leerFichero().get(6),leerFichero().get(7)};

    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
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

