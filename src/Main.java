import java.util.Scanner;
import model.Aluno;
import model.Instrutor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Insira a idade do aluno: ");
        int idadeAluno = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o CPF do aluno: ");
        String cpfAluno = sc.nextLine();

        System.out.println("Insira o número de matrícula: ");
        String matricula = sc.nextLine();

        System.out.println("Insira o nome do instrutor: ");
        String nomeInstrutor = sc.nextLine();

        System.out.println("Insira a idade do instrutor: ");
        int idadeInstrutor = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o CPF do instrutor: ");
        String cpfInstrutor = sc.nextLine();

        System.out.println("Insira o CREF do instrutor: ");
        String cref = sc.nextLine();

        System.out.println("Insira o tipo do plano (mensal, trimestral, anual): ");
        String plano = sc.nextLine();

        Instrutor instrutor = new Instrutor(nomeInstrutor, idadeInstrutor, cpfInstrutor, cref);
        Aluno aluno = new Aluno(nomeAluno, idadeAluno, cpfAluno, matricula);

        aluno.realizarMatricula(plano, instrutor);
        instrutor.acompanharAluno(aluno);

        System.out.println("\n--- Resumo da Matrícula ---");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Plano: " + aluno.verPlano().toUpperCase());
        System.out.println("Instrutor: " + instrutor.getNome());
        System.out.println("CREF: " + instrutor.getCref());

        sc.close();
    }
}