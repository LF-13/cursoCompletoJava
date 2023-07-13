package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio02;

public class Employee {
    public String name;
    double grossSalary, tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
}
