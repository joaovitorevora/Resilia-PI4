import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Midia> midias;
    private List<Integer> ordemExecucao;
    private Midia midiaAtual;

    public Playlist(List<Midia> midias) {
        this.midias = midias;
        this.ordemExecucao = new ArrayList<Integer>();
        for (int i = 0; i < midias.size(); i++) {
            ordemExecucao.add(i);
        }
        this.midiaAtual = null;
    }

    //getter e setter
    public List<Midia> getMidias(){
        return midias;
    }

    public void setMidias(List<Midia> midias){
        this.midias = midias;
    }
    public List<Integer> getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(List<Integer> ordemExecucao){
        this.ordemExecucao = ordemExecucao;
    }

    public Midia getMidiaAtual(){
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual){
        this.midiaAtual = midiaAtual;
    }

}