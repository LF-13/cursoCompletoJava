package C_programacaoOrientadaAObjetos.application;

import C_programacaoOrientadaAObjetos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = teclado.nextLine();

        System.out.print("Price: ");
        double price = teclado.nextDouble();


        Product product = new Product(name, price);


        product.setName("computador");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());


        System.out.println();
        System.out.printf("Product data: " + product.toString());

        System.out.println();
        System.out.print("Entrer the number of products to be added in stock: ");
        int quantity = teclado.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Remove the number of products to be in stock: ");
        int remove = teclado.nextInt();
        product.removeProducts(remove);

        System.out.println();
        System.out.println("Updated data: " + product);


        teclado.close();


    }
}
