import controlador.Procesar;
import modelo.Pregunta;
/*import modelo.PreguntasRespuestas;*/
import modelo.Fichero;
import modelo.PreguntasRespuestas;
import vista.MetodosPrograma;

import java.util.ArrayList;
/*import vista.MetodosPrograma;*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Procesar proc = new Procesar();
        proc.procesar();

        MetodosPrograma main = new MetodosPrograma();
        main.ejecutarPrograma();
    }
}