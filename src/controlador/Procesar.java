package controlador;

import modelo.Fichero;
import modelo.Pregunta;

import java.util.ArrayList;

public class Procesar extends Fichero {

    ArrayList <Pregunta> preguntas = new ArrayList<Pregunta>();
    ArrayList <Pregunta> preguntasFavoritas = new ArrayList<Pregunta>();
    public Procesar() {
        preguntas = procesarPreguntas();
        preguntasFavoritas = procesarFavoritas();
    }


    public ArrayList<Pregunta> procesarPreguntas() {
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

        ArrayList<String> listaPreguntas = leerFichero("data/preguntas.txt");
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

        Pregunta praux = new Pregunta();


        //La condicion del bucle asegura que no se exceda del tamaño del bucle sumando la posicion mas los elementos que se encuentran en la lista
        //Sumo a la posicion la diferencia entre las preguntas (8 posiciones)
        for (int posicionEnLaLista = 0; posicionEnLaLista +8<= listaPreguntas.size(); posicionEnLaLista+=saltador) {

                //Lanza error porque el contador llega al valor de la longitud todal de la lista
                moduloAux = String.valueOf(listaPreguntas.get(posicionEnLaLista));
                preguntaAux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 1));
                temaAux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 2));
                opcion1Aux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 3));
                opcion2Aux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 4));
                opcion3Aux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 5));
                opcion4Aux = String.valueOf(listaPreguntas.get(posicionEnLaLista + 6));
                respuesta = String.valueOf(listaPreguntas.get(posicionEnLaLista + 7));

                praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
                preguntas.add(praux);
                posicionEnLaLista = saltador * contadorDeVuelta;
                contadorDeVuelta++;

        }
        return preguntas;
    }

    public ArrayList<Pregunta> procesarFavoritas() {
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

        ArrayList<String> listaFavoritas = leerFichero("data/preguntasFavoritas.txt");
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

        Pregunta praux = new Pregunta();


        //La condicion del bucle asegura que no se exceda del tamaño del bucle sumando la posicion mas los elementos que se encuentran en la lista
        //Sumo a la posicion la diferencia entre las preguntas (8 posiciones)
        for (int posicionEnLaLista = 0; posicionEnLaLista +8<= listaFavoritas.size(); posicionEnLaLista+=saltador) {

            //Lanza error porque el contador llega al valor de la longitud todal de la lista
            moduloAux = String.valueOf(listaFavoritas.get(posicionEnLaLista));
            preguntaAux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 1));
            temaAux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 2));
            opcion1Aux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 3));
            opcion2Aux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 4));
            opcion3Aux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 5));
            opcion4Aux = String.valueOf(listaFavoritas.get(posicionEnLaLista + 6));
            respuesta = String.valueOf(listaFavoritas.get(posicionEnLaLista + 7));

            praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
            preguntasFavoritas.add(praux);
            posicionEnLaLista = saltador * contadorDeVuelta;
            contadorDeVuelta++;

        }
        return preguntasFavoritas;
    }
    public ArrayList<Pregunta> getPreguntasProcesadas() {
        return preguntas;
    }

    public ArrayList<Pregunta> getPreguntasFavoritasProcesadas() {
        return preguntasFavoritas;
    }
}

