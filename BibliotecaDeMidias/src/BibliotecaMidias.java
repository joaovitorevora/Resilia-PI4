import java.util.List;
public class BibliotecaMidias{
        private List<Midia> midias;
        private String usuario;
        private Playlist[] playlists;

        public BibliotecaMidias(List<Midia> midias, String usuario,Playlist[] playlists){
                this.midias=midias;
                this.usuario = usuario;
                this.playlists = playlists;

        }
}
