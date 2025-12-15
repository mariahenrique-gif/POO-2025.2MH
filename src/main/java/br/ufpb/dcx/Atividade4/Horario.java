package br.ufpb.dcx.Atividade4;

public class Horario {
    private DiaDaSemana dia;
    private int horarioInicio;
    private int horarioFim;


    public Horario( DiaDaSemana dia, int horarioInicio, int horarioFim){
        this.horarioInicio=horarioInicio;
        this.horarioFim=horarioFim;
        this.dia=dia;
    }

    public int getHorarioInicio() {
        return this.horarioInicio;
    }

    public int getHorarioFim() {
        return horarioFim;
    }
    public DiaDaSemana getDia(){
        return this.dia;
    }
}
