package vista;

import modelo.Pregunta;
import modelo.Preguntas;

import java.util.*;


public class MetodosPrograma extends Preguntas {


    public void ejecutarPrograma() {

        //SwitchCase que llama al resto de los métodos para ejecutar el programa

        int menu = 0;
        int tiempo = 0;
        boolean explosionDePrograma = false;

        do {


            try {
                System.out.println("Bienvenido al programa de test sanitarios!");
                tiempo = Escanner.pedirNumeros("De cuanto tiempo quieres el test?¿");
                menu = Escanner.pedirNumeros("1.-Preguntas por Aleatoria\n2.-Preguntas por modulo\n3.-PreguntaPorTemas\n4.-Crear pregunta");

                do {

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
                        case 5:
                            preguntasFavoritas();
                            break;

                    }

                    tiempo++;

                } while (tiempo > 0);

            } catch (InputMismatchException a) {
                explosionDePrograma = true;
                System.out.println("Caracter no permitido. Introduce numeros!");
            }

        }while (explosionDePrograma);

    }

    public void preguntaAleatoria() {


        int numeroPreguntasAResponder;
        int numeroRespuestasCorrectas = 0;
        int numeroRespuestasFalladas = 0;
        int numeroRespuestasEnBlanco = 0;

        String respuesta = "";
        String marcarComoFavorita;

        ArrayList<Pregunta> preguntasFavoritas = getPreguntasFavoritas();
        ArrayList <String> falladas = new ArrayList<String>();
        Pregunta preguntaFavorita = new Pregunta();

        try {
            System.out.println("PREGUNTA ALEATORIA. Para marcar como favorita pulse f tras una pregunta");
            //El numero de preguntas será lo que dure el test
            numeroPreguntasAResponder = Escanner.pedirNumeros("Cuantas preguntas quieres responder?¿");
            ArrayList<Pregunta> listaPreguntas = getPreguntas();

            do {
                System.out.println("PREGUNTA:\n");
                //Randomiza la list entera
                Collections.shuffle(listaPreguntas);
                //Muestra la pregunta
                System.out.println(listaPreguntas.getFirst().getModulo());
                System.out.println(listaPreguntas.getFirst().getTema());
                System.out.println(listaPreguntas.getFirst().getPreguntaString());

                System.out.println(Arrays.toString(listaPreguntas.getFirst().getOpciones()));
                respuesta = Escanner.pedirStringConMensaje("Introduce tu respuesta!");

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

                marcarComoFavorita = Escanner.pedirStringConMensaje("Añadir a favorita?");

                if (marcarComoFavorita.equalsIgnoreCase("f")) {
                    preguntaFavorita = new Pregunta(listaPreguntas.getFirst().getModulo(), listaPreguntas.getFirst().getPreguntaString(),
                            listaPreguntas.getFirst().getTema(), listaPreguntas.getFirst().getOpciones(), listaPreguntas.getFirst().getRespuestaString());
                    preguntasFavoritas.add(preguntaFavorita);
                    System.out.println("Has marcado esta pregunta como favorita");
                } else {
                    System.out.println("Pregunta NO añadida a favoritos!");
                }

                System.out.println("Llevas "+numeroRespuestasCorrectas+" preguntas acertadas, "+numeroRespuestasFalladas+" preguntas falladas "+numeroRespuestasEnBlanco+" preguntas en blanco");

                numeroPreguntasAResponder--;
                System.out.println("Te quedan " + numeroPreguntasAResponder + " Preguntas");

            } while (numeroPreguntasAResponder > 0);

            System.out.println("Has acertado " + numeroRespuestasCorrectas + "Preguntas");
            System.out.println("Has fallado estas preguntas " + numeroRespuestasFalladas);

            for (String i : falladas) {
                System.out.println(i);
            }

            System.out.println("Has dejado en blanco " + numeroRespuestasEnBlanco + "preguntas");


        }catch (InputMismatchException e) {
            System.out.println("Introduce un numero!");
        }


    }

    public void preguntaPorModulo() {

        int numeroPreguntasAResponder = 0;
        int numeroRespuestasCorrectas = 0;
        int numeroRespuestasFalladas = 0;
        int numeroRespuestasEnBlanco = 0;

        String respuesta;
        String moduloAbuscar;
        String marcarComoFavorita;

        ArrayList <Pregunta> preguntasFavoritas = getPreguntasFavoritas();
        ArrayList<String> falladas = new ArrayList<String>();
        ArrayList<Pregunta> listaPreguntas = getPreguntas();

        Set<Pregunta> preguntasIguales = new HashSet<Pregunta>();




        Pregunta preguntaFavorita = new Pregunta();

        do {
            System.out.println("Preguntas por modulo. Para marcar como favorita pulse f tras una pregunta");
            numeroPreguntasAResponder = getPreguntas().size();

            moduloAbuscar = Escanner.pedirStringConMensaje("Introduce el módulo sobre el que quieres hacer el test:");
            System.out.println("Has escogido " + moduloAbuscar + "!");

            for (Pregunta i : listaPreguntas) {
                if (i.getModulo().equals(moduloAbuscar)) {
                    preguntasIguales.add(i);
                }
            }


            for (Pregunta i : preguntasIguales) {
                System.out.println(i.getModulo());
                System.out.println(i.getTema());
                System.out.println(i.getPreguntaString());
                System.out.println(Arrays.toString(i.getOpciones()));
                respuesta = Escanner.pedirStringSinMensaje();

                if (respuesta.equals(i.getRespuestaString())) {
                    System.out.println("Respuesta correcta!");
                } else if (respuesta.equals(" ")) {
                    numeroRespuestasEnBlanco++;

                } else {
                    falladas.add(listaPreguntas.getFirst().getRespuestaString());
                    System.out.println("Respuesta fallada!\n");
                    numeroRespuestasFalladas++;
                }

            }
            marcarComoFavorita = Escanner.pedirStringConMensaje("Añadir a favorita?");

            if (marcarComoFavorita.equalsIgnoreCase("f")){
                preguntaFavorita = new Pregunta(listaPreguntas.getFirst().getModulo(), listaPreguntas.getFirst().getPreguntaString(),
                        listaPreguntas.getFirst().getTema(),listaPreguntas.getFirst().getOpciones(),listaPreguntas.getFirst().getRespuestaString());
                preguntasFavoritas.add(preguntaFavorita);
                System.out.println("Has marcado esta pregunta como favorita");
            }else{
                System.out.println("Pregunta NO añadida a favoritos!");
            }

            System.out.println("Llevas "+numeroRespuestasCorrectas+" preguntas acertadas, "+numeroRespuestasFalladas+" preguntas falladas "+numeroRespuestasEnBlanco+" preguntas en blanco");


            System.out.println("Te quedan "+numeroPreguntasAResponder+" preguntas");
        } while (numeroPreguntasAResponder > 0);

        System.out.println("Has acertado " + numeroRespuestasCorrectas + "Preguntas");
        System.out.println("Has fallado estas preguntas " + numeroRespuestasFalladas);

        for (String i : falladas) {
            System.out.println(i);
        }

        System.out.println("Has dejado en blanco " + numeroRespuestasEnBlanco + "preguntas");


    }

    public void preguntaPorTemas() {

        Scanner teclado = new Scanner(System.in);

        int numeroRespuestasCorrectas = 0;
        int numeroRespuestasFalladas = 0;
        int numeroRespuestasEnBlanco = 0;
        String marcarComoFavorita;


        String respuesta;
        ArrayList <Pregunta> preguntasFavoritas = getPreguntasFavoritas();
        Set<Pregunta> preguntasIguales = new HashSet<Pregunta>();
        String temaAbuscar;
        ArrayList<Pregunta> listaPreguntas = getPreguntas();

        Pregunta preguntaFavorita = new Pregunta();




            System.out.println("Preguntas por tema. Para marcar como favorita pulse f tras una pregunta");
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
                    numeroRespuestasCorrectas++;
                } else if (respuesta.isEmpty()) {
                    System.out.println("Respuesta marcada como en blanco :!");
                    numeroRespuestasEnBlanco++;
                } else {
                    System.out.println("Has fallado :(");
                    numeroRespuestasFalladas++;
                }
                System.out.println("Llevas "+numeroRespuestasCorrectas+" preguntas acertadas, "+numeroRespuestasFalladas+" preguntas falladas "+numeroRespuestasEnBlanco+" preguntas en blanco");
            }
            marcarComoFavorita = Escanner.pedirStringConMensaje("Añadir a favorita?");

            if (marcarComoFavorita.equalsIgnoreCase("f")) {
                preguntaFavorita = new Pregunta(listaPreguntas.getFirst().getModulo(), listaPreguntas.getFirst().getPreguntaString(),
                        listaPreguntas.getFirst().getTema(), listaPreguntas.getFirst().getOpciones(), listaPreguntas.getFirst().getRespuestaString());
                preguntasFavoritas.add(preguntaFavorita);
                System.out.println("Has marcado esta pregunta como favorita");
            } else {
                System.out.println("Pregunta NO añadida a favoritos!");
            }

            System.out.println("Has Acertado = " + numeroRespuestasCorrectas + " Preguntas");
            System.out.println("Has fallado = " + numeroRespuestasFalladas + " Preguntas");
            System.out.println("Has dejado en blanco = " + numeroRespuestasEnBlanco + " Preguntas");
            teclado.close();


    }

    public void preguntasFavoritas(){

        ArrayList <Pregunta> preguntasFavsAuxiliar = getPreguntasFavoritas();

        for(Pregunta i:preguntasFavsAuxiliar){
            System.out.println(i.getModulo());
            System.out.println(i.getTema());
            System.out.println(i.getPreguntaString());
            System.out.println(Arrays.toString(i.getOpciones()));
        }

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
