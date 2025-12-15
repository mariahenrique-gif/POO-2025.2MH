package br.ufpb.dcx.AmigoSecreto.Atividade3;

public class TestaAmigoGUI {
    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();

        // a) Inicializa o sistema e cadastra os amigos
        sistema.cadastraAmigo("José", "jose@email.com");
        sistema.cadastraAmigo("Maria", "maria@email.com");
        sistema.cadastraAmigo("Ana", "ana@email.com");

        // b) Configura os resultados do sorteio
        try {
            sistema.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
            sistema.configuraAmigoSecretoDe("maria@email.com", "ana@email.com");
            sistema.configuraAmigoSecretoDe("ana@email.com", "jose@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // c) Envia uma mensagem de algum dos amigos para todos
        sistema.enviarMensagemParaTodos("Boa sorte no amigo secreto!", "ana@email.com", false);

        // d) Exibe todas as mensagens enviadas
        System.out.println("\nMensagens enviadas:");
        for (Mensagem m : sistema.pesquisaTodasAsMensagens()) {
            System.out.println(m.getTextoCompletoAExibir());
        }

        // e) Relatório de quem tirou quem
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