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
        System.out.println("1.-Preguntas por tema\n2.-Preguntas aleatorias\n3.Preguntas por modulo");

        menu = teclado.nextInt();

        switch (menu){
            case 1:
                preguntaPorTemas();
                break;
            case 2:
                preguntaAleatoria();
                break;
            case 3:
                /*preguntaPorModulo();*/
                break;
        }

    }

   public void preguntaAleatoria(){
        Scanner teclado = new Scanner(System.in);
        int numeroPreguntasAResponder = 0;
        int numeroRespuestasCorrectas = 0;
        String respuesta = "";
        System.out.println("Cuantas preguntas quieres responder?¿");
        numeroPreguntasAResponder = teclado.nextInt();
        PreguntasRespuestas listaPreguntas = new PreguntasRespuestas();

        do {
            System.out.println("PREGUNTA:\n");
            Collections.shuffle(listaPreguntas.getPreguntas());
            System.out.println(listaPreguntas.getPreguntas().getFirst().getModulo());
            System.out.println(listaPreguntas.getPreguntas().getFirst().getTema());
            System.out.println(listaPreguntas.getPreguntas().getFirst().getPreguntaString());
            System.out.println(Arrays.toString(listaPreguntas.getPreguntas().getFirst().getOpciones()));
            System.out.println("Introduce tu respuesta!");

            respuesta = new Scanner(System.in).nextLine();
            if (respuesta.matches(listaPreguntas.getPreguntas().getFirst().getRespuestaString())) {
                System.out.println("Respuesta correcta!");
                numeroRespuestasCorrectas++;
            }else{
                System.out.println("Respuesta fallada!\n");
            }
            numeroPreguntasAResponder--;
            System.out.println("Te quedan "+numeroPreguntasAResponder+" Preguntas");

        }while (numeroPreguntasAResponder > 0);
       System.out.println("Has acertado "+ numeroRespuestasCorrectas +"Preguntas");
       teclado.close();
       System.out.println(Arrays.toString(listaPreguntas.getPreguntas().getFirst().getOpciones()));


    }

    public void preguntaPorTemas(){

        //Hacer un hashSet que almacene las preguntas iguales que quiera el usuario
        Scanner teclado = new Scanner(System.in);
        Set <Pregunta> preguntasIguales = new HashSet<Pregunta>();
        String seleccion = "";
        System.out.println("Preguntas por tema");
        System.out.println("Introduce el módulo sobre el que quieres hacer el test:");
        seleccion = teclado.nextLine();
        System.out.println("Has escogido "+seleccion+"!");



        mostrarPreguntas();





    }
}
