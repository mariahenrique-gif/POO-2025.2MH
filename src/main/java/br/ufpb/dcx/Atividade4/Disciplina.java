package br.ufpb.dcx.Atividade4;

import java.util.List;

public class Disciplina {
    private String nome;
    private int codigo;
    private int matriculaProf;
    private List<Horario>horarios;

    public Disciplina (String nome, int codigo,int matriculaProf, List<Horario> horarios){
        this.nome= nome;
        this.codigo=codigo;
        this.matriculaProf =matriculaProf;
        this.horarios=horarios;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatriculaProfessor() {
        return this.matriculaProf;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public List<Horario> getHorarios() {
        return this.horarios;
    }
}
