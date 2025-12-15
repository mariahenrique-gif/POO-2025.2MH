package br.ufpb.dcx.heloisa.Atividade1;

import javax.swing.*;

public class TestaAluno {
    public static void main(String[] args) {
        int quantidadeAlunos = 3;
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for (int k = 0; k < quantidadeAlunos; k++) {
            String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno:");
            String matriculaAluno = JOptionPane.showInputDialog("Matrícula do Aluno:");

            double[] notas = new double[3];
            for (int i = 0; i < 3; i++) {
                String notaStr = JOptionPane.showInputDialog("Nota " + (i + 1) + " do Aluno:");
                notas[i] = Double.parseDouble(notaStr);
            }

            alunos[k] = new Aluno(nomeAluno, matriculaAluno, notas);
        }

        System.out.println("Dados dos alunos:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
}