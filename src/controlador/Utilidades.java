package controlador;


import modelo.Pregunta;
import vista.Escanner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Timer;


public class Utilidades extends Pregunta {


    public void temporizador(){
        double tiempoDecidido = Escanner.pedirConDecimales("Cuanto tiempo quieres que dure el test?||ejemplo -> 0.0");
        double resto = 0.1;
    }

    public static void verificarFavorita(String marcarComoFavorita, ArrayList<Pregunta> preguntasFavoritas,   ArrayList<Pregunta> listaPreguntas){
        Pregunta preguntaFavorita = new Pregunta();
        if (marcarComoFavorita.equalsIgnoreCase("f")) {
            preguntaFavorita = new Pregunta(listaPreguntas.getFirst().getModulo(), listaPreguntas.getFirst().getPreguntaString(),
                    listaPreguntas.getFirst().getTema(), listaPreguntas.getFirst().getOpciones(), listaPreguntas.getFirst().getRespuestaString());

            escribirFicheroExistente("data/preguntasFavoritas.txt",preguntaFavorita.toString());

            preguntasFavoritas.add(preguntaFavorita);
            System.out.println("Has marcado esta pregunta como favorita");

        } else {
            System.out.println("Pregunta NO añadida a favoritos!");
        }
    }


}
