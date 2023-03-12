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
}