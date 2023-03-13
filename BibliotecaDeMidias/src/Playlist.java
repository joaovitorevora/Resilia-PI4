
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Playlist {
    //Atributos , como tipo Midia (composição)
    private Midia[] midias;
    private Midia[] ordemExecucao;
    private Midia midiaAtual;
    //construtor
    public Playlist(Midia[] midias,Midia[] ordemExecucao, Midia midiaAtual){
        this.midias = midias;
        this.midiaAtual = midiaAtual;
        this.ordemExecucao = ordemExecucao;
    }

    //getter e setter
    public Midia[] getMidias(){
        return midias;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }

    public Midia[] getOrdemExecucao() {

        return ordemExecucao;
    }

    public void setOrdemExecucao(Midia[] ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public Midia getMidiaAtual(){
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual){
        this.midiaAtual = midiaAtual;
    }

//metodos
    public void proxima_midia() {
        //verifica se a ordem de execução é nula ou tem pelo menos 1 elemento
        if (ordemExecucao != null && ordemExecucao.length > 0) {
            //percorre a ordem de execução ate que o valor de i seja maior do que a quantidade dentro da ordem de execução
            for (int i = 0; i < ordemExecucao.length; i++) {
                //verifica se o elemento atual é igual a midia atual
                if (ordemExecucao[i] == midiaAtual) {

                    //verifica se (i) é menor do que o comprimento do array -1, se for, significa que ainda há "mídias" a serem executadas após a mídia atual.
                    if (i < ordemExecucao.length - 1) {
                        //essa linha define  a proxima midia
                        midiaAtual = ordemExecucao[i+1];
                        //para o comando ao identificar a proxima midia
                        break;
                    } else {
                        //se a midia atual for a ultima do array, atribui o valor atual para o primeiro valor
                        midiaAtual = ordemExecucao[0];
                        break;
                    }
                }
            }
        }
    }
// basicamente faz o contrario do método proxima_midia
    public void midia_anterior() {
        if (ordemExecucao != null && ordemExecucao.length > 0) {
            for (int i = 0; i < ordemExecucao.length; i++) {
                if (ordemExecucao[i] == midiaAtual) {
                    if (i > 0) {
                        midiaAtual = ordemExecucao[i-1];
                        break;
                    } else {
                        midiaAtual = ordemExecucao[ordemExecucao.length-1];
                        break;
                    }
                }
            }
        }
    }

    public void misturar_ordem() {
        List<Midia> listaMidias = Arrays.asList(midias); // converte o array em uma lista
        Collections.shuffle(listaMidias); // embaralha a lista
        ordemExecucao = listaMidias.toArray(new Midia[listaMidias.size()]); // converte a lista de volta em um array


    }

    public void exibir_playlist() {
        System.out.println("Playlist:");

        // é um for-each, percorre todos os elementos de ordemExecucao e a cada item, sera atribuito o elemento a variavel m
        for (Midia m : ordemExecucao) {
            //exibe o titulo de cada item da variavel m
            System.out.println(m.getTitulo());
        }
    }

}