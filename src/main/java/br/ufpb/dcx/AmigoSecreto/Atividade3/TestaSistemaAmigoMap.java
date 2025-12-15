package br.ufpb.dcx.AmigoSecreto.Atividade3;

public class TestaSistemaAmigoMap {
    public static void main(String[] args) {
        SistemaAmigoMAP sistema = new SistemaAmigoMAP();

        // Cadastrando amigos
        sistema.cadastraAmigo("José", "jose@email.com");
        sistema.cadastraAmigo("Maria", "maria@email.com");
        sistema.cadastraAmigo("Ana", "ana@email.com");

        // Configurando sorteio
        try {
            sistema.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
            sistema.configuraAmigoSecretoDe("maria@email.com", "ana@email.com");
            sistema.configuraAmigoSecretoDe("ana@email.com", "jose@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Enviando mensagens
        sistema.enviarMensagemParaTodos("Boa sorte no amigo secreto!", "ana@email.com", false);
        sistema.enviarMensagemParaAlguem("Oi Maria, espero que goste do presente!", "jose@email.com", "maria@email.com", true);

        // Exibindo mensagens
        System.out.println("\nMensagens enviadas:");
        for (Mensagem m : sistema.pesquisaTodasAsMensagens()) {
            System.out.println(m.getTextoCompletoAExibir());
        }

        // Relatório do sorteio
        System.out.println("\nRelatório do sorteio:");
        try {
            System.out.println("José tirou: " + sistema.pesquisaAmigoSecretoDe("jose@email.com"));
            System.out.println("Maria tirou: " + sistema.pesquisaAmigoSecretoDe("maria@email.com"));
            System.out.println("Ana tirou: " + sistema.pesquisaAmigoSecretoDe("ana@email.com"));
        } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
