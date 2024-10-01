public class Pregunta extends Fichero{


    private String modulo;
    private int tema;
    private String pregunta;
    private String opcion;

    public Pregunta(String modulo, int tema, String pregunta, String opcion) {
        this.modulo = modulo;
        this.tema = tema;
        this.pregunta = pregunta;
        this.opcion = opcion;
    }

    private Pregunta crearPregunta(){
        String ficheroString = "";
        String formatoRegex = "[;]";
        Fichero fichero = new Fichero();
        ficheroString = fichero.leerFichero();

        ficheroString.split(formatoRegex);



    }
}

