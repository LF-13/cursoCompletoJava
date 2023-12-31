package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Response {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();
        double result = CurrencyCoverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        scanner.close();
    }
}
