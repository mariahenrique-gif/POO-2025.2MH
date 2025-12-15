package br.ufpb.dcx.Atividade4;

public class Professor {
    private String nome;
    private int matricula;

    public Professor(String Nome, int matricula){
        this.nome=nome;
        this.matricula= matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }
}
