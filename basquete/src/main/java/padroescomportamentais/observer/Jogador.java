package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void integrarEquipe(EquipeBasquete equipe) {
        equipe.addObserver(this);
    }

    public void update(Observable equipe, Object arg1) {
        this.ultimaNotificacao = this.nome + ", resultado de teste registrado na " + equipe.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
