

public class Main {
    public static void main(String[] args) {

        // É para dar erro em uma das musicas pois forcei um erro intencional com nota acima de 5
        // Apenas alguns dados principais ja foram atribuidos valor, mas todos estao funcionais.



        // instancia e chama o método tocar_playlist
        BibliotecaMidias biblioteca = new BibliotecaMidias();

        biblioteca.tocar_playlist("musica");

    }
}
