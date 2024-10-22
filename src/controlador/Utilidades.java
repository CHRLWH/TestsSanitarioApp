package controlador;


import modelo.Pregunta;
import modelo.Preguntas;
import vista.Escanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Timer;


public class Utilidades extends Preguntas {


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

    public void updateFicheroPreguntas(String rutaficheroAupdatear, ArrayList <Pregunta> datosQueEscribir){
        //BORRAR FICHERO Y UPDATEARLO ESCRIBIENDOLO OTRA VEZ
        String datosTransFormadosParaEscribir = "";

        for (Pregunta i:getPreguntas()){
            Pregunta praux = new Pregunta(i.getModulo(),i.getTema(),i.getPreguntaString(),i.getOpciones(),i.getRespuestaString());
            datosTransFormadosParaEscribir.concat(praux.toString());
       }

        File ficheroAescribir = new File(rutaficheroAupdatear);

        ficheroAescribir.delete();

        escribirFicheroNuevo(rutaficheroAupdatear,datosTransFormadosParaEscribir);

    }


}
