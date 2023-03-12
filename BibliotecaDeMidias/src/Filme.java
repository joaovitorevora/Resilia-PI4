
public class Filme extends Midia{
        private int duracao;
        private String tipo;
        private Ator[] elenco;
        private String diretor;
        private String produtor;

        public Filme (String titulo, int ano, String genero,int duracao, String tipo,Ator[] elenco, String diretor, String produtor){
                super(titulo,ano, genero);
                this.duracao = duracao;
                this.tipo = tipo;
                this.elenco = elenco;
                this.diretor = diretor;
                this.produtor = produtor;
        }
}
