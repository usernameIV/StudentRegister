package Registração;

public class Aluno {
    private String Nome;
    private int Semestre;
    private String Sala;
    private String Curso;
    private int Nota;
    private Endereço Endereço;

    public Aluno(String Nome, int Semestre, String Sala, String Curso, int Nota, Endereço Endereço) {
        this.Nome = Nome;
        this.Semestre = Semestre;
        this.Sala = Sala;
        this.Curso = Curso;
        this.Nota = Nota;
        this.Endereço = Endereço;
    }

    public void printData() {
        System.out.println("Nome: "+ Nome);
        System.out.println("Semestre: "+ Semestre);
        System.out.println("Sala: "+ Sala);
        System.out.println("Curso: "+ Curso);
        System.out.println("Nota: "+ Nota);
        Endereço.printDetails();
        System.out.println();
    }
}
