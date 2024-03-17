package transmissions;

import plataforms.IPlatform;

public class Live implements ITransmission{
    protected IPlatform platform;
    public Live() {}

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadCasting() {
        System.out.println("Iniciando a transmissão");
    }

    @Override
    public void result() {
        System.out.println("============= ON AIR =============");
    }
}
