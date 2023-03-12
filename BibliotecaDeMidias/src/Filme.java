
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

        //getter e setter
        public int getDuracao() {
                return duracao;
        }

        public void setDuracao(int duracao) {
                this.duracao = duracao;
                if (duracao < 50){
                        this.setTipo("Curta");
                } else{
                        this.setTipo("Longa");
                }

        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;

        }

        public Ator[] getElenco(){
                return elenco;
        }

        public void setElenco(Ator[] elenco)
        {
                this.elenco = elenco;

        }

        public String getDiretor()
        {
                return diretor;

        }

        public void setDiretor(String diretor)
        {
                this.diretor = diretor;

        }

        public String getProdutor(){

                return produtor;
        }

        public void setProdutor(String produtor){

                this.produtor = produtor;
        }
}
