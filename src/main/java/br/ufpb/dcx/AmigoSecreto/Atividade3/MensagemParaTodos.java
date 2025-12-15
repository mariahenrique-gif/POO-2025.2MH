package br.ufpb.dcx.AmigoSecreto.Atividade3;

public class MensagemParaTodos extends Mensagem{

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima){
    super(texto, emailRemetente, anonima);
    }

    public String getTextoCompletoAExibir(){
        //TODO:
        if (ehAnonima()) {
            return "Mensagem para todos. Texto: " + getTexto();
        } else {
            return "Mensagem de " + getEmailRemetente() + " para todos. Texto: " + getTexto();
        }
    }
}

