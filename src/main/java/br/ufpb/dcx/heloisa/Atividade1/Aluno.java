package br.ufpb.dcx.heloisa.Atividade1;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double [] notas;

    public Aluno (String nome, String matricula, double[] notas){
        this.nome= nome;
        this.matricula= matricula;
        this.notas= notas;
    }


    Aluno(){
        this("", "", new double[3] );
    }



    public String getNome() {
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
    public double getMedia(){
        double soma=0;
        for (double nota:notas){
            soma+= nota;
        }
        return soma/3;
    }

    @Override
    public String toString(){
        return "Aluno: " + nome +","+ "Matricula : " + matricula + "," + "Notas: " + Arrays.toString(notas);
    }

}