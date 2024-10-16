package vista;

import modelo.Pregunta;
import modelo.Preguntas;

import java.util.*;

public class MetodosPrograma extends Preguntas {


    public void ejecutarPrograma() {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Bienvenido al programa de test sanitarios!");
        System.out.println("De cuanto tiempo quieres el test?¿");
        System.out.println("1.-Preguntas por Aleatoria\n2.-Preguntas por modulo\n3.-PreguntaPorTemas\n4.-Crear pregunta");

        menu = teclado.nextInt();

        switch (menu) {
            case 1:
                preguntaAleatoria();
                break;
            case 2:
                preguntaPorModulo();
                break;
            case 3:
                preguntaPorTemas();
                break;
            case 4:
                crearPregunta();
                break;

        }

    }

    public void preguntaAleatoria() {
        Scanner teclado = new Scanner(System.in);
        int numeroPreguntasAResponder = 0;
        int numeroRespuestasCorrectas = 0;
        int numeroRespuestasFalladas = 0;
        int numeroRespuestasEnBlanco = 0;
        String respuesta = "";
        ArrayList <String> falladas = new ArrayList<String>();
        Pregunta preguntaFallada = new Pregunta();
        System.out.println("Cuantas preguntas quieres responder?¿");
        numeroPreguntasAResponder = teclado.nextInt();
        ArrayList<Pregunta> listaPreguntas = getPreguntas();

        do {
            System.out.println("PREGUNTA:\n");
            Collections.shuffle(listaPreguntas);
            System.out.println(listaPreguntas.getFirst().getModulo());
            System.out.println(listaPreguntas.getFirst().getTema());
            System.out.println(listaPreguntas.getFirst().getPreguntaString());
            System.out.println(Arrays.toString(listaPreguntas.getFirst().getOpciones()));
            System.out.println("Introduce tu respuesta!");

            respuesta = new Scanner(System.in).nextLine();
            if (respuesta.matches(listaPreguntas.getFirst().getRespuestaString())) {
                System.out.println("Respuesta correcta!");
                numeroRespuestasCorrectas++;
            } else if (respuesta.equals(" ")) {
                numeroRespuestasEnBlanco++;

            } else {
                falladas.add(listaPreguntas.getFirst().getPreguntaString());
                System.out.println("Respuesta fallada!\n");
                numeroRespuestasFalladas++;
            }
            numeroPreguntasAResponder--;
            System.out.println("Te quedan " + numeroPreguntasAResponder + " Preguntas");

        } while (numeroPreguntasAResponder > 0);
        System.out.println("Has acertado " + numeroRespuestasCorrectas + "Preguntas");
        System.out.println("Has fallado estas preguntas "+numeroRespuestasFalladas);

        for (String i:falladas){
            System.out.println(i);
        }

        System.out.println("Has dejado en blanco "+numeroRespuestasEnBlanco+"preguntas");
        teclado.close();


    }

    public void preguntaPorModulo() {
        //Hacer un hashSet que almacene las preguntas iguales que quiera el usuario
        Scanner teclado = new Scanner(System.in);

        int numeroPreguntasAResponder = 0;
        int numeroRespuestasCorrectas = 0;
        int numeroRespuestasFalladas = 0;
        int numeroRespuestasEnBlanco = 0;

        String respuesta;
        String moduloAbuscar;

        ArrayList <String> falladas = new ArrayList<String>();
        Set<Pregunta> preguntasIguales = new HashSet<Pregunta>();
        ArrayList<Pregunta> listaPreguntas = getPreguntas();

        System.out.println("Preguntas por modulo");
        System.out.println("Introduce el módulo sobre el que quieres hacer el test:");
        moduloAbuscar = teclado.nextLine();
        System.out.println("Has escogido " + moduloAbuscar + "!");

        for (Pregunta i : listaPreguntas) {
            if (i.getModulo().equals(moduloAbuscar)) {
                preguntasIguales.add(i);
            }
        }


        for (Pregunta i : preguntasIguales) {
            System.out.println(i.getModulo());
            System.out.println(i.getPreguntaString());
            System.out.println(Arrays.toString(i.getOpciones()));
            respuesta = new Scanner(System.in).nextLine();

            if (respuesta.equals(i.getRespuestaString())) {
                System.out.println("Respuesta correcta!");
            } else if (respuesta.equals(" ")) {
                numeroRespuestasEnBlanco++;

            } else {
                falladas.add(listaPreguntas.getFirst().getRespuestaString());
                System.out.println("Respuesta fallada!\n");
                numeroRespuestasFalladas++;
            }

            numeroPreguntasAResponder--;
            System.out.println("Te quedan " + numeroPreguntasAResponder + " Preguntas");

        } while (numeroPreguntasAResponder > 0);
        System.out.println("Has acertado " + numeroRespuestasCorrectas + "Preguntas");
        System.out.println("Has fallado estas preguntas "+numeroRespuestasFalladas);

        for (String i:falladas){
            System.out.println(i);
        }

        System.out.println("Has dejado en blanco "+numeroRespuestasEnBlanco+"preguntas");
        teclado.close();


    }

    public void preguntaPorTemas() {
        Scanner teclado = new Scanner(System.in);

        String respuesta;

        Set<Pregunta> preguntasIguales = new HashSet<Pregunta>();
        String temaAbuscar;
        ArrayList<Pregunta> listaPreguntas = getPreguntas();

        System.out.println("Preguntas por tema");
        System.out.println("Introduce el tema sobre el que quieres hacer el test:");
        temaAbuscar = teclado.nextLine();
        System.out.println("Has escogido " + temaAbuscar + "!");

        for (Pregunta i : listaPreguntas) {
            if (i.getTema().equals(temaAbuscar)) {
                preguntasIguales.add(i);
            }
        }


        for (Pregunta i : preguntasIguales) {
            System.out.println(i.getTema());
            System.out.println(i.getPreguntaString());
            System.out.println(Arrays.toString(i.getOpciones()));
            respuesta = new Scanner(System.in).nextLine();

            if (respuesta.equals(i.getRespuestaString())) {
                System.out.println("Respuesta correcta!");
            } else {
                System.out.println("Has fallado :(");
            }
        }

        teclado.close();

    }

    public void preguntaDeTodosLosTemas(){

    }

    public void crearPregunta(){
        Scanner teclado = new Scanner(System.in);
        String moduloAux;
        String temaAux;
        String preguntaAux;
        String opcion1Aux;
        String opcion2Aux;
        String opcion3Aux;
        String opcion4Aux;
        String respuesta;

        Pregunta praux = new Pregunta();


        System.out.println("Crear una pregunta");
        System.out.println("Introduce el modulo para el que quieres crear ésta pregunta");
        moduloAux = teclado.nextLine();
        System.out.println("Introduce el tema para el que quieres crear ésta pregunta");
        temaAux = teclado.nextLine();
        System.out.println("Introduce la pregunta");
        preguntaAux = teclado.nextLine();
        System.out.println("Introduce las opciones");
        System.out.println("[1]OPCION 1");
        opcion1Aux = teclado.nextLine();
        System.out.println("[2]OPCION 2");
        opcion2Aux = teclado.nextLine();
        System.out.println("[3]OPCION 3");
        opcion3Aux = teclado.nextLine();
        System.out.println("[4]OPCION 4");
        opcion4Aux = teclado.nextLine();
        System.out.println("Introduce la respuesta correcta");
        respuesta  = teclado.nextLine();

        praux = new Pregunta(moduloAux, temaAux, preguntaAux, new String[]{opcion1Aux, opcion2Aux, opcion3Aux, opcion4Aux}, respuesta);
        getPreguntas().add(praux);
        System.out.println("Pregunta creada correctamente!");
        System.out.println(praux);
        escribirFichero(praux.toString());

    }
}
