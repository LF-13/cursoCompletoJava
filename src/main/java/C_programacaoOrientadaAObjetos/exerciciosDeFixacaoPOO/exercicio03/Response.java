package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Response {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        Student student = new Student();
        keyboard.nextLine();

        student.setNotes((int) keyboard.nextDouble());
        student.setNotes((int) keyboard.nextDouble());
        student.setNotes((int) keyboard.nextDouble());

        student.totalGrades();


        keyboard.close();
    }
}
