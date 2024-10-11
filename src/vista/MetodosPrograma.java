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
        }

    }

   /* public void preguntaAleatoria(){
        Collections.shuffle(getPreguntasN());
        System.out.println("Pregunta: "+getPreguntasN().getFirst().getPreguntaString());
        System.out.println("Opciones: " + Arrays.toString(getPreguntasN().getFirst().getOpciones()));
        System.out.println("Introduce tu respuesta (El numero)");
        int respuesta = new Scanner(System.in).nextInt();


    }*/

    /*public Pregunta preguntaPorTemas(){

    }*/
}
