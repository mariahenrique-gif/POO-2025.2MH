package br.ufpb.dcx.AmigoSecreto.Atividade3;

public class TestaSistemaAmigo {

        public static void main(String[] args) {
            SistemaAmigo sistema = new SistemaAmigo();

            sistema.cadastraAmigo("José", "jose@email.com");
            sistema.cadastraAmigo("Maria", "maria@email.com");

            try {
                sistema.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
                sistema.configuraAmigoSecretoDe("maria@email.com", "jose@email.com");
            } catch (AmigoInexistenteException e) {
                System.out.println(e.getMessage());
            }

            sistema.enviarMensagemParaAlguem("Oi José!", "maria@email.com", "jose@email.com", true);
            sistema.enviarMensagemParaTodos("Olá a todos!", "maria@email.com", true);

            for (Mensagem m : sistema.pesquisaMensagensAnonimas()) {
                System.out.println(m.getTextoCompletoAExibir());
            }

            try {
                String amigoSecretoDeJose = sistema.pesquisaAmigoSecretoDe("jose@email.com");
                if (amigoSecretoDeJose.equals("maria@email.com")) {
                    System.out.println("Ok");
                }
            } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
                System.out.println(e.getMessage());
            }
        }
    }