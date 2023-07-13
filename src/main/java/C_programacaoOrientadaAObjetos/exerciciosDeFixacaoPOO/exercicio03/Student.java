package C_programacaoOrientadaAObjetos.exerciciosDeFixacaoPOO.exercicio03;

public class Student {
    private String name;
    private double notes;

    public void setNotes(int notes) {
        this.notes = this.notes + notes;
    }

    public void totalGrades(){
        System.out.println("FINAL GRADE = " + this.notes);
        if (this.notes < 60) {
            System.out.println("FAILED");
            System.out.println("MISSING "+ (60 - this.notes) + " POINTS");
        } else {
            System.out.println("PASS");
        }
    }
}
