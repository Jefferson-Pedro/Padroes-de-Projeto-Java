package plataforms;

public class TwitchTV implements IPlatform{
    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal!");
    }
}
