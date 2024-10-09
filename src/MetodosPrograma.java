import java.util.Scanner;

public class MetodosPrograma extends PreguntasRespuestas {


    public void ejecutarPrograma(){
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Bienvenido al programa de test sanitarios!");
        System.out.println("1.-Preguntas por tema\n2.-Preguntas aleatorias");

        menu = teclado.nextInt();

        switch (menu){
            case 1:
                break;
            case 2:
                preguntaAleatoria();
                break;
        }

    }

    public Pregunta preguntaAleatoria(){
        int numeroAleatorio = (int) (Math.random() * (getPreguntas().size()));

        int posicionDeLaPreguntaQueQuiero = getPreguntas().indexOf(numeroAleatorio);

        return getPreguntas().get(posicionDeLaPreguntaQueQuiero);


    }


}
