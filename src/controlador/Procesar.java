package controlador;

import modelo.Fichero;
import modelo.Pregunta;

import java.util.ArrayList;

public class Procesar extends Fichero {

    ArrayList <Pregunta> preguntas = new ArrayList<Pregunta>();
    public Procesar() {
        preguntas = procesar();
    }

    public ArrayList<Pregunta> procesar() {
        String moduloAux;
        String temaAux;
        String preguntaAux;
        String opcion1Aux;
        String opcion2Aux;
        String opcion3Aux;
        String opcion4Aux;
        String respuesta;

        int contadorDeVuelta = 0;
        int saltador = 8;

        ArrayList<String> lista = leerFichero();
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();


        //La condicion del bucle asegura que no se exceda del tamaño del bucle sumando la posicion mas los elementos que se encuentran en la lista
        //Sumo a la posicion la diferencia entre las preguntas (8 posiciones)
        for (int posicionEnLaLista = 0; posicionEnLaLista +8<= lista.size(); posicionEnLaLista+=saltador) {

                //Lanza error porque el contador llega al valor de la longitud todal de la lista
                moduloAux = String.valueOf(lista.get(posicionEnLaLista));
                preguntaAux = String.valueOf(lista.get(posicionEnLaLista + 1));
                temaAux = String.valueOf(lista.get(posicionEnLaLista + 2));
                opcion1Aux = String.valueOf(lista.get(posicionEnLaLista + 3));
                opcion2Aux = String.valueOf(lista.get(posicionEnLaLista + 4));
                opcion3Aux = String.valueOf(lista.get(posicionEnLaLista + 5));
                opcion4Aux = String.valueOf(lista.get(posicionEnLaLista + 6));
                respuesta = String.valueOf(lista.get(posicionEnLaLista + 7));

                Pregunta praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
                preguntas.add(praux);
                posicionEnLaLista = saltador * contadorDeVuelta;
                contadorDeVuelta++;

        }
        return preguntas;
    }

    public ArrayList<Pregunta> getPreguntasProcesadas() {
        return preguntas;
    }

}

