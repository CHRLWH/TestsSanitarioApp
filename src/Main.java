import controlador.Procesar;
/*import modelo.PreguntasRespuestas;*/
import vista.MetodosPrograma;
/*import vista.MetodosPrograma;*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Procesar proc = new Procesar();
        proc.procesarPreguntas();
        proc.procesarFavoritas();

        MetodosPrograma main = new MetodosPrograma();
        main.ejecutarPrograma();
    }
}