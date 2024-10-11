package vista;

import modelo.Pregunta;
import modelo.PreguntasRespuestas;

import java.util.*;

public class MetodosPrograma extends PreguntasRespuestas {


    public void ejecutarPrograma(){
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Bienvenido al programa de test sanitarios!");
        System.out.println("De cuanto tiempo quieres el test?¿");
        System.out.println("1.-Preguntas por tema\n2.-Preguntas aleatorias");

        menu = teclado.nextInt();

        switch (menu){
            case 1:
                /*preguntaPorTemas();*/
                break;
            case 2:
                /*preguntaAleatoria();*/
                break;
            case 3:
                /*preguntaPorModulo();*/
                break;
        }

    }

   public void preguntaAleatoria(){
        PreguntasRespuestas listaPreguntas = new PreguntasRespuestas();

       Collections.shuffle(listaPreguntas.getPreguntas());
       System.out.println(listaPreguntas.getPreguntas().getFirst().getModulo());
       System.out.println(listaPreguntas.getPreguntas().getFirst().getTema());
       System.out.println(listaPreguntas.getPreguntas().getFirst().getPreguntaString());
       System.out.println(Arrays.toString(listaPreguntas.getPreguntas().getFirst().getOpciones()));


    }

    /*public Pregunta preguntaPorTemas(){

    }*/
}
