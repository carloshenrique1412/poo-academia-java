package model;

public class Aluno extends Pessoa {
    private String matricula;
    private String plano;
    private boolean ativo;
    private Instrutor instrutor;

    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.ativo = false;
    }

    public void realizarMatricula(String plano, Instrutor instrutor) {
        this.plano = plano;
        this.instrutor = instrutor;
        this.ativo = true;

        System.out.println("Matrícula realizada com sucesso para " + nome);
    }

    public void cancelarMatricula() {
        this.ativo = false;
        System.out.println("Matrícula cancelada para " + nome);
    }

    public String verPlano() {
        return plano;
    }

    public String getNome() {
        return nome;
    }
}
