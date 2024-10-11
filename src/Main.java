import controlador.Procesar;
import modelo.Pregunta;
/*import modelo.PreguntasRespuestas;*/
import modelo.Fichero;
import modelo.PreguntasRespuestas;

import java.util.ArrayList;
/*import vista.MetodosPrograma;*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fichero fich = new Fichero();
        ArrayList <String> lista = new ArrayList<>();
        fich.leerFichero();
        Procesar procesar = new Procesar();
        procesar.procesar();

        PreguntasRespuestas pr1 = new PreguntasRespuestas();

        pr1.getPreguntasProcesadas().toString();
    }
}