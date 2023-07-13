package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Response {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        Rectangle rectangle = new Rectangle();


        rectangle.width = keyboard.nextDouble();
        System.out.println(" e ");
        rectangle.height = keyboard.nextDouble();
        keyboard.close();

        System.out.println("AREA = " + rectangle.area());

        System.out.println("PERIMETER = " + rectangle.perimeter());

        System.out.println("DIAGONAL = " + rectangle.diagonal());


    }
}
