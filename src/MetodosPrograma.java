import java.util.*;

public class MetodosPrograma extends PreguntasRespuestas {


    public void ejecutarPrograma(){
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Bienvenido al programa de test sanitarios!");
        System.out.println("1.-Preguntas por tema\n2.-Preguntas aleatorias");

        menu = teclado.nextInt();

        switch (menu){
            case 1:
                preguntaPorTemas();
                break;
            case 2:
                preguntaAleatoria();
                break;
        }

    }

    public Pregunta preguntaAleatoria(){
        Collections.shuffle(getPreguntasN());
        return getPreguntasN().getFirst();
    }

    public Pregunta preguntaPorTemas(){

    }
}
