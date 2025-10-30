package padroescomportamentais.observer;

import java.util.Observable;

public class EquipeBasquete extends Observable {

    private String nomeEquipe;
    private String temporada;
    private String categoria;
    private String tipoTeste;

    public EquipeBasquete(String nomeEquipe, String temporada, String categoria, String tipoTeste) {
        this.nomeEquipe = nomeEquipe;
        this.temporada = temporada;
        this.categoria = categoria;
        this.tipoTeste = tipoTeste;
    }

    public void registrarResultadosTestes() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "EquipeBasquete{" +
                "nomeEquipe='" + nomeEquipe + '\'' +
                ", temporada='" + temporada + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tipoTeste='" + tipoTeste + '\'' +
                '}';
    }
}
