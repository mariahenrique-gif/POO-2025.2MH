package br.ufpb.dcx.AmigoSecreto.Atividade3;

public class Amigo {

    private String nome;
    private String email;
    private String emailAmigoSorteado;

    public Amigo (String nome, String email){
        this.nome= nome;
        this.email= email;
        this.emailAmigoSorteado = emailAmigoSorteado;

    }
public Amigo(){

}

public String getNome(){

        return nome;
}
public String getEmail(){

        return email;
}
public String getEmailAmigoSorteado(){

        return emailAmigoSorteado;
}

public void setNome(String nome) {

        this.nome = nome;
    }

    public void setEmailAmigoSorteado(String emailAmigoSorteado) {

        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    public void setEmail(String email) {

    }

    public void setAmigoSorteado(String emailAmigoSorteado) {
    }
}
