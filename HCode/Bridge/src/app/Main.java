package app;

import plataforms.IPlatform;
import plataforms.Youtube;
import transmissions.Live;

public class Main {

    public static void main(String[] args) {
      startLive(new Youtube());

    }

    public static void startLive(IPlatform platform){
        System.out.println("... aguarde!");
        Live live = new Live(platform);
        live.broadCasting();
        live.result();
    }
}
