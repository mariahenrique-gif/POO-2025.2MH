package br.ufpb.dcx.Atividade4;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Horario aula1= new Horario ( DiaDaSemana.TERCA,8,10);
        Horario aula2= new Horario ( DiaDaSemana.TERCA,13,15);

        System.out.println("Dia da semana da aula 1: " + aula1.getDia());

    List<Horario> horariosPoo= new ArrayList<>();
    horariosPoo.add(aula1);
    horariosPoo.add(aula2);


    Disciplina pooTurma1= new Disciplina("POO", 1111, 123456, horariosPoo);



    }
}
