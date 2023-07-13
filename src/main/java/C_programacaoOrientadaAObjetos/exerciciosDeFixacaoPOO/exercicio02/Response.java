package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Response {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("Name: ");

        Scanner keyboard = new Scanner(System.in);
        Employee employee = new Employee();
        employee.name = keyboard.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = keyboard.nextDouble();
        System.out.print("Tax: ");
        employee.tax = keyboard.nextDouble();


        System.out.println("Employee: "+employee.name+" , $ " + employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(keyboard.nextDouble());
        System.out.println("Updated data: " + employee.name +", $ "+ employee.grossSalary);

        keyboard.close();
    }
}
