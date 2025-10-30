package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveNotificarUmJogador() {
        EquipeBasquete equipe = new EquipeBasquete("Lakers", "2024/2025", "Profissional", "Teste Físico");
        Jogador jogador = new Jogador("LeBron James");
        jogador.integrarEquipe(equipe);
        equipe.registrarResultadosTestes();
        assertEquals("LeBron James, resultado de teste registrado na EquipeBasquete{nomeEquipe='Lakers', temporada='2024/2025', categoria='Profissional', tipoTeste='Teste Físico'}", jogador.getUltimaNotificacao());
    }

    @Test
    void deveNotificarJogadores() {
        EquipeBasquete equipe = new EquipeBasquete("Lakers", "2024/2025", "Profissional", "Teste Físico");
        Jogador jogador1 = new Jogador("LeBron James");
        Jogador jogador2 = new Jogador("Anthony Davis");
        jogador1.integrarEquipe(equipe);
        jogador2.integrarEquipe(equipe);
        equipe.registrarResultadosTestes();
        assertEquals("LeBron James, resultado de teste registrado na EquipeBasquete{nomeEquipe='Lakers', temporada='2024/2025', categoria='Profissional', tipoTeste='Teste Físico'}", jogador1.getUltimaNotificacao());
        assertEquals("Anthony Davis, resultado de teste registrado na EquipeBasquete{nomeEquipe='Lakers', temporada='2024/2025', categoria='Profissional', tipoTeste='Teste Físico'}", jogador2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarJogador() {
        EquipeBasquete equipe = new EquipeBasquete("Lakers", "2024/2025", "Profissional", "Teste Físico");
        Jogador jogador = new Jogador("LeBron James");
        equipe.registrarResultadosTestes();
        assertEquals(null, jogador.getUltimaNotificacao());
    }

    @Test
    void deveNotificarJogadorEquipeA() {
        EquipeBasquete equipeA = new EquipeBasquete("Lakers", "2024/2025", "Profissional", "Teste Físico");
        EquipeBasquete equipeB = new EquipeBasquete("Celtics", "2024/2025", "Profissional", "Teste Técnico");
        Jogador jogador1 = new Jogador("LeBron James");
        Jogador jogador2 = new Jogador("Jayson Tatum");
        jogador1.integrarEquipe(equipeA);
        jogador2.integrarEquipe(equipeB);
        equipeA.registrarResultadosTestes();
        assertEquals("LeBron James, resultado de teste registrado na EquipeBasquete{nomeEquipe='Lakers', temporada='2024/2025', categoria='Profissional', tipoTeste='Teste Físico'}", jogador1.getUltimaNotificacao());
        assertEquals(null, jogador2.getUltimaNotificacao());
    }
}
