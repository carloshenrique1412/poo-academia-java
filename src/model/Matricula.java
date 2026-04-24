package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Matricula {
    private int idMatricula;
    private Aluno aluno;
    private Plano plano;
    private Instrutor instrutor;
    private LocalDate dataMatricula;
    private String status;

    public Matricula(int idMatricula, Aluno aluno, Plano plano, Instrutor instrutor) {
        this.idMatricula = idMatricula;
        this.aluno = aluno;
        this.plano = plano;
        this.instrutor = instrutor;
        this.dataMatricula = LocalDate.now();
        this.status = "ATIVA";
    }

    public int getIdMatricula() { return idMatricula; }
    public Aluno getAluno() { return aluno; }
    public Plano getPlano() { return plano; }
    public Instrutor getInstrutor() { return instrutor; }
    public LocalDate getDataMatricula() { return dataMatricula; }
    public String getStatus() { return status; }

    public void setIdMatricula(int idMatricula) { this.idMatricula = idMatricula; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public void setPlano(Plano plano) { this.plano = plano; }
    public void setInstrutor(Instrutor instrutor) { this.instrutor = instrutor; }
    public void setStatus(String status) { this.status = status; }

    public void cancelar() { this.status = "CANCELADA"; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Matricula #" + idMatricula +
               "\n  Aluno    : " + aluno.getNome() +
               "\n  Plano    : " + plano.getTipo() +
               "\n  Instrutor: " + instrutor.getNome() +
               "\n  Data     : " + dataMatricula.format(fmt) +
               "\n  Status   : " + status;
    }
}
