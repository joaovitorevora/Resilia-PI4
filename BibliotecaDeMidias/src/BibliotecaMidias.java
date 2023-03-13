
import java.util.Scanner;

public class BibliotecaMidias {
        //Atributos
        private Midia[] midias;
        private String usuario;
        private Playlist[] playlists;


        //getter e setter

        public Midia[] getMidias() {
                return midias;
        }

        public void setMidias(Midia[] midias) {
                this.midias = midias;
        }

        public String getUsuario() {
                return usuario;
        }

        public void setUsuario(String usuario) {
                this.usuario = usuario;
        }

        public Playlist[] getPlaylists() {
                return playlists;
        }

        public void setPlaylists(Playlist[] playlists) {
                this.playlists = playlists;
        }
        //métodos
        public void tocar_playlist(String resp) {

                System.out.println("-------Spotyflix-------");

                Scanner resposta = new Scanner(System.in);
                System.out.println("Qual playlist deseja acessar? \n Filme | Musicas");
                resp = resposta.nextLine();

                if (resp.equalsIgnoreCase("Filme") || resp.equalsIgnoreCase("Filmes"))  {
                        //se resposta for = filme, cria um vetor de atores dentro de elenco
                        //Cria filmes / respectivos dados ja foram atribuidos diretamente
                        Ator[] elenco = new Ator[3];

                        elenco[0] = new Ator("Joao","21/09/2000","Oscar","Masculino","teatro");
                        elenco[1] = new Ator("Carlos", "10/10/2010","Melhor diretor","Masculino","cinema");
                        elenco[2] = new Ator("Maria","12/07/1967","Melhor curta", "Fem","cinema");

                        Filme f1 = new Filme("M3GAN", 2022,"Terror",102,"longo", elenco,"Carlos","Alberto");
                        Filme f2 = new Filme("O telefone preto", 2021,"Thriller/Drama",102,"longo", elenco,"Joao","Alberto");
                        Filme f3 = new Filme("Emancipation", 2022,"Drama/Ação",132,"longo", elenco,"Karlla","Cristina");
                        Filme f4 = new Filme("Gato de botas: o último pedido", 2022,"Aventura/Comédia",100,"longo", elenco,"Fernando","Henrique");
                        Filme f5 = new Filme("Adão Negro", 2022,"Ação/Aventura",125,"longo", elenco,"Michael ","Corleone");
                        Filme f6 = new Filme("Pantera Negra: Wakanda para sempre", 2022,"Ação/Aventura",161,"longo", elenco,"Kay","Adams");
                        Filme f7 = new Filme("Luta por justiça", 2019,"Drama/Drama Jurídico",136,"longo", elenco,"Peter","Clemenza");
                        Filme f8 = new Filme("Coringa", 2019,"Suspense/Drama",122,"longo", elenco,"Rodrigo","Alberto");
                        Filme f9 = new Filme("Casablanca", 1942,"Romance/Drama",102,"longo", elenco,"André","Douglas");
                        Filme f10 = new Filme("O Poderoso Chefão", 1972,"Crime/Drama",175,"longo", elenco,"Anderson","Alberto");
                        // Logica para definir o tipo do filme esta na classe Filme ***** nao utilizei para aparecer na tela.

                        // adiciona filmes dentro de um vetor
                        Filme [] filmes = {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10};
                        //cria uma nova playlist filmes, com os parametros de filme
                        Playlist playlist = new Playlist(filmes,filmes, f1);
                        System.out.println("-------Spotyflix-------");

                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                    + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                    + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                     + " |  Duração: " + ((Filme) playlist.getMidiaAtual()).getDuracao() + " min");
                        //vai repetir o sysout ate que o valor de i seja maior que a quantidade de itens dentro do vetor e adiciona 1 a cada vez que passa
                        for (int i = 0; i < filmes.length; i++) {

                                System.out.println("Deseja ir para: Proximo | Anterior | Embaralhar Playlist | Exibir playlist");
                                resp = resposta.nextLine();

                                //se resposta for = proximo independente se é upper ou lower case
                                if (resp.equalsIgnoreCase("proximo")) {

                                        //chama função da classe playlist
                                        playlist.proxima_midia();

                                        System.out.println("-------Spotyflix-------");
                                        //tras o valor de cada atributo
                                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                                    + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                                    + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                                     + " |  Duração: " + ((Filme) playlist.getMidiaAtual()).getDuracao() + " min");


                                } else if (resp.equalsIgnoreCase("anterior")) {
                                        playlist.midia_anterior();

                                        System.out.println("-------Spotyflix-------");
                                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                                + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                                + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                                + " |  Duração: " + ((Filme) playlist.getMidiaAtual()).getDuracao() + " min");
                                }

                                else if ((resp.equalsIgnoreCase("Embaralhar") || resp.equalsIgnoreCase ("Embaralhar Playlist"))) {
                                        playlist.misturar_ordem();

                                        System.out.println("-------Spotyflix-------");
                                }

                                else if ((resp.equalsIgnoreCase("Exibir") || resp.equalsIgnoreCase("Exibir Playlist"))) {
                                        playlist.exibir_playlist();

                                        System.out.println("-------Spotyflix-------");
                                }

                                //senao for nenhuma das opções indicadas acima
                                 else {
                                        System.out.println("Por favor, escolha apenas entre as opções disponíveis!");
                                        i--; // Decrementa o índice para repetir a pergunta
                                }
                        }
                        System.out.println("Esse OU todos os filmes ja foram assistidos");

                        //Cria musicas/ respectivos dados ja foram atribuidos diretamente
                } else if (resp.equalsIgnoreCase("Musica") || resp.equalsIgnoreCase("Musicas")) {
                        Musica m1 = new Musica("Let It Be", 1970, "Rock", 243, "The Beatles", 5);
                        Musica m2 = new Musica("Bohemian Rhapsody", 1975, "Rock", 354, "Queen", 3);
                        Musica m3 = new Musica("Stairway to Heaven", 1971, "Rock", 480, "Led Zeppelin", 1);
                        Musica m4 = new Musica("Anna Júlia", 1999, "Power pop", 243, "The Beatles", 5);
                        Musica m5 = new Musica("Shape of You", 2017, "Pop/R&B",212 , "Ed Sheeran", 7); // é para dar erro **nota acima de 5
                        Musica m6 = new Musica("I Will Always Love You", 1992, "R&B/Ballad", 480, "Whitney Houston", 5);
                        Musica m7 = new Musica("Thriller", 1982, "Pop/Rock", 243, "Michael Jackson", 5);
                        Musica m8 = new Musica("Smells Like Teen Spirit", 1991, "Grunge/Rock", 354, "Nirvana", 5);
                        Musica m9 = new Musica("Billie Jean", 1983, "Pop/Funk", 480, "Michael Jackson", 5);
                        Musica m10 = new Musica("Hotel California", 1976, "Rock", 243, "Eagles", 5);
                        Musica m11 = new Musica("Like a Rolling Stone", 1965, "Rock", 354, "Bob Dylan", 5);
                        Musica m12 = new Musica("Sweet Child o' Mine", 1987, "Rock", 480, "Guns N' Roses", 5);
                        Musica m13 = new Musica("Beat It", 1983, "Pop/Rock", 243, "Michael Jackson", 5);
                        Musica m14 = new Musica("Livin' on a Prayer", 1986, "Rock", 354, "Bon Jovi", 5);
                        Musica m15 = new Musica("Yesterday", 1965, "Pop/Rock", 480, "The Beatles", 5);
                        Musica m16 = new Musica("I Want to Hold Your Hand", 1963, "Pop/Rock", 243, "The Beatles", 5);
                        Musica m17 = new Musica("Nothing Else Matters", 1991, "Rock", 354, "Metallica", 5);
                        Musica m18 = new Musica("Hallelujah", 1984, "Folk/Rock", 480, "Jeff Buckley", 5);



                        // adiciona musicas dentro de um vetor
                        Midia[] midias = {m1, m2, m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18};
                        // Cria um objeto Playlist com a lista de mídias e a midiaAtual
                        Playlist playlist = new Playlist(midias, midias, m1);
                        System.out.println("-------Spotyflix-------");

                        //tras o valor de cada atributo
                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                + "  |  Duração: " + ((Musica) playlist.getMidiaAtual()).getDuracao() + " Segundos"
                                + "  |  Notas: " + ((Musica) playlist.getMidiaAtual()).getNotas() + " Estrelas");


                        for (int i = 0; i < midias.length; i++) {

                                System.out.println("Deseja ir para: Proxima | Anterior | Embaralhar Playlist | Exibir playlist");
                                resp = resposta.nextLine();
                                //se resposta for = proxima independente se é upper ou lower case
                                if (resp.equalsIgnoreCase("proxima")) {

                                        //chama função da classe playlist
                                        playlist.proxima_midia();

                                        System.out.println("-------Spotyflix-------");

                                        //tras o valor de cada atributo
                                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                                         + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                                         + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                                         + "  |  Duração: " + ((Musica) playlist.getMidiaAtual()).getDuracao() + " Segundos"
                                                         + "  |  Notas: " + ((Musica) playlist.getMidiaAtual()).getNotas() + " Estrelas");



                                } else if (resp.equalsIgnoreCase("anterior")) {
                                        playlist.midia_anterior();

                                        System.out.println("-------Spotyflix-------");

                                        System.out.println("Título: " + playlist.getMidiaAtual().getTitulo()
                                                + "  |  Gênero: " + playlist.getMidiaAtual().getGenero()
                                                + "  |  Lançamento: " + playlist.getMidiaAtual().getAno()
                                                + "  |  Duração: " + ((Musica) playlist.getMidiaAtual()).getDuracao() + " Segundos"
                                                + "  |  Notas: " + ((Musica) playlist.getMidiaAtual()).getNotas() + " Estrelas");


                                } else if ((resp.equalsIgnoreCase("Embaralhar") || resp.equalsIgnoreCase ("Embaralhar Playlist"))) {
                                        playlist.misturar_ordem();

                                        System.out.println("-------Spotyflix-------");

                                } else if ((resp.equalsIgnoreCase("Exibir") || resp.equalsIgnoreCase("Exibir Playlist"))) {
                                        playlist.exibir_playlist();

                                        System.out.println("-------Spotyflix-------");

                                } else {
                                        System.out.println("Por favor, escolha apenas entre as opções disponíveis!");
                                        i--; // Decrementa o índice para repetir a pergunta
                                }

                        }
                        System.out.println("Essa OU todas as musicas foram tocadas");
                }
        }
}
