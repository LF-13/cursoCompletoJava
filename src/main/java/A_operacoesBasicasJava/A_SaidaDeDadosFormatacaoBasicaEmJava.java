package A_operacoesBasicasJava;

import java.util.Locale;
/**
 %f = ponto flutuante
 %d = inteiro
 %s = texto
 %n = quebra de linha */
public class A_SaidaDeDadosFormatacaoBasicaEmJava {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        int gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f", product1, price1);
        System.out.printf("%n%s, which price is $ %.2f", product2, price2);
        System.out.printf("%n%nRecord: " + "%d years old, code %d and gender: %c %n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
