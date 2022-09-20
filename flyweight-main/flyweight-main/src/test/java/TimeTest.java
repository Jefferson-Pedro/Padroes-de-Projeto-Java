import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void deveRetornarJogadores() {
        Time time = new Time();
        time.contratar("Messi", "Ponta Esquerda", "Ataque");
        time.contratar("Neymar", "Ponta Direita", "Ataque");
        time.contratar("Mbappe", "Centroavante", "Ataque");
        time.contratar("Marquinhos", "Zagueiro", "Defesa");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Messi', posicao='Ponta Esquerda', areaAtuacao='Ataque'}",
                "Jogador{nome='Neymar', posicao='Ponta Direita', areaAtuacao='Ataque'}",
                "Jogador{nome='Mbappe', posicao='Centroavante', areaAtuacao='Ataque'}",
                "Jogador{nome='Marquinhos', posicao='Zagueiro', areaAtuacao='Defesa'}");

        assertEquals(saida, time.obterJogadores());
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Time time = new Time();
        time.contratar("Messi", "Ponta Esquerda", "Ataque");
        time.contratar("Neymar", "Ponta Direita", "Ataque");
        time.contratar("Mbappe", "Centroavante", "Ataque");
        time.contratar("Marquinhos", "Zagueiro", "Defesa");

        assertEquals(4, PosicaoFactory.getTotalPosicoes());
    }
}