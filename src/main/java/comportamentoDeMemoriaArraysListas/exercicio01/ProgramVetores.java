package comportamentoDeMemoriaArraysListas.exercicio01;
/**
 * Faça um programa p ler um número inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostre a altura média dessas pessoas
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double media = sum / n;
        System.out.printf("Média: %.2f", media);

        scanner.close();
    }
}