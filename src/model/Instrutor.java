package model;

public class Instrutor extends Pessoa {
    private String cref;

    public Instrutor(String nome, int idade, String cpf, String cref) {
        super(nome, idade, cpf);
        this.cref = cref;
    }

    public void acompanharAluno(Aluno aluno) {
        System.out.println("Instrutor " + nome + " está acompanhando o aluno " + aluno.getNome());
    }

    public String getCref() {
        return cref;
    }
}
