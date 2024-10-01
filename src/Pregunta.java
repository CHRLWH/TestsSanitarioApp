public class Pregunta extends Fichero{

    private int tema;
    private String modulo;
    private String pregunta;
    private String opcion;

    public Pregunta(int tema, String opcion, String pregunta, String modulo) {
        this.tema = tema;
        this.opcion = opcion;
        this.pregunta = pregunta;
        this.modulo = modulo;
    }


}
