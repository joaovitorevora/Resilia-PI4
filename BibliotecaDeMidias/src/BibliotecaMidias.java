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

        //getter e setter
        public List<Midia> getMidias(){
                return midias;
        }

        public void setMidias (List <Midia> midias){
                this.midias = midias;
        }

        public String getUsuario(){
                return usuario;
        }

        public void setUsuario(String usuario){
                this.usuario = usuario;
        }

        public Playlist[] getPlaylists(){
                return playlists;
        }

        public void setPlaylists(Playlist[] playlists){
                this.playlists = playlists;
        }

}
