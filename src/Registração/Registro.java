package Registração;
import java.util.Scanner;
public class Registro {

    Scanner s = new Scanner(System.in);
    Scanner nl = new Scanner(System.in);
    private Aluno[] alunos;
    public Registro() {

    }
    public int alunosQtd() {
        System.out.println("Insira a quantidade de alunos: ");
        return s.nextInt();
    }
    int quantidadeAlunos = alunosQtd();
    public void Init() {

        alunos = new Aluno[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++ ) {
            System.out.println("Insira os dados do registro do aluno(a) " + (i + 1) +": " );

            System.out.println("Insira o nome do aluno(a) "+ (i + 1) + ": ");
            String Nome = nl.nextLine();
            System.out.println("Insira o semestre do aluno(a) " + (i + 1) + ": ");
            int Semestre = s.nextInt();
            System.out.println("Insira a sala do aluno(a) " + (i + 1) + ": ");
            String Sala = nl.nextLine();
            System.out.println("Insira o curso do aluno(a) " + (i + 1) + ": ");
            String Curso = nl.nextLine();
            System.out.println("Insira a nota do aluno(a) " + (i + 1) + ": ");
            int Nota = s.nextInt();
            System.out.println("Resgistre agora o endereço do aluno(a) " + (i + 1) + ": ");
            Endereço endereço = CreateAddress();
            alunos[i] = new Aluno(Nome, Semestre, Sala, Curso, Nota, endereço);
        }
    }
    private Endereço CreateAddress() {
        System.out.println("Insira a rua: ");
        String rua = nl.nextLine();
        System.out.println("Insira o bairro: ");
        String bairro = nl.nextLine();
        System.out.println("Insira a cidade: ");
        String cidade = nl.nextLine();
        System.out.println("Insira o estado: ");
        String estado = nl.nextLine();
        System.out.println("Insira o CEP: ");
        String cep = nl.nextLine();
        return new Endereço(rua, bairro, cidade, estado, cep);

    }
    public void Show () {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println();
            System.out.println("Registro do aluno(a) " + (i + 1) + ": ");
            alunos[i].printData();
        }


    }
}






