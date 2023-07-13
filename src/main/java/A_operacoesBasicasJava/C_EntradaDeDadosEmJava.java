package A_operacoesBasicasJava;

import java.util.Locale;
import java.util.Scanner;

public class C_EntradaDeDadosEmJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.next();
        System.out.println("Você digitou: " + nome);
        teclado.close();
    }
}

class EntradaDeDadosEmJavaInt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.println("Você digitou: " + numero);
        teclado.close();
    }
}

class EntradaDeDadosEmJavaDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        System.out.println("Você digitou: " + numero);
        teclado.close();
    }
}

class EntradaDeDadosEmJavaChar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char numero = teclado.next().charAt(0);
        System.out.println("Você digitou: " + numero);
        teclado.close();
    }
}

class EntradaDeVariosDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Coloque: Seu nome, sua idade e seu gênero entre M para masculino ou F para feminino:");
        String nome = teclado.nextLine();
        int idade = teclado.nextInt();
        char sexo = teclado.next().charAt(0);
        System.out.printf("%nMeu nome é: %s %nTenho: %d anos %nSou do gênero: %c", nome, idade, sexo);
        teclado.close();
    }
}