package br.ufpb.dcx.Atividade4;

import java.util.*;

public class SistemaGerenciaProfsMap implements SistemaGerenciaProfs {

    private Map <Integer, Professor> professores = new HashMap<>();
    private Map<Integer, Disciplina> disciplinas = new HashMap<>();


    public Professor pesquisaProfessor(int matriculaProf)
            throws ProfessorInexistenteException{
        Professor p = this.professores.get(matriculaProf);
        if (p == null)
            throw new ProfessorInexistenteException ("Não existe professor com essa  matrícula:"
                    + matriculaProf);
        else
            return p;
    }
    public List<Horario> consultaHorariosDeAulaDoProfessor(int matriculaProf)
            throws ProfessorInexistenteException{
        List <Horario> horarios = new LinkedList<>();
        boolean acheiProfessor = false;
        for (Disciplina d: this.disciplinas.values()){
            if (d.getMatriculaProfessor() == matriculaProf){
                horarios.addAll(d.getHorarios());
                acheiProfessor = true;
            }
            if (!acheiProfessor){
                throw new ProfessorInexistenteException("Não foi encontrado nenhum horario para este professor no sistema!");
            }
            else {
                return horarios;
            }

        }
        return horarios;
    }

    public List<String> consultaNomesDisciplinasDoProfessor(int matriculaProf){
        //TODO:
        List<String> nomes= new ArrayList<>();
        for (Disciplina d : this.disciplinas.values()){
            if(d.getMatriculaProfessor() == matriculaProf){
                nomes.add(d.getNome());
            }
        }
        return nomes;
    }

    public void cadastraProfessor(int matriculaProf, String nome)
            throws ProfessorJaExisteException{
        //TODO:
        if(this.professores.containsKey(matriculaProf)){
            throw new ProfessorJaExisteException("Já existe professor com matrícula: " + matriculaProf);
        }
       else{ Professor novo = new Professor(nome, matriculaProf);
        this.professores.put(matriculaProf, novo);
       }

    }

    public void cadastraDisciplina(String nomeDisciplina, int codigoDisciplina,  int matriculaProfessor, List<Horario> horarios)
            throws DisciplinaJaExisteException{
        //TODO:
        if (this.disciplinas.containsKey(codigoDisciplina)) {
            throw new DisciplinaJaExisteException("Já existe disciplina com código: " + codigoDisciplina);
        }
        Disciplina nova = new Disciplina(nomeDisciplina, codigoDisciplina, matriculaProfessor, horarios);
        this.disciplinas.put(codigoDisciplina, nova);

    }

    public Disciplina pesquisaDisciplina(int codigoDisciplina) throws
            DisciplinaInexistenteException{
        //TODO:
        Disciplina d = this.disciplinas.get(codigoDisciplina);
        if (d == null) {
            throw new DisciplinaInexistenteException("Não existe disciplina com código: " + codigoDisciplina);
        }
        return d;

    }

}



