public class Artista {
        //Atributos
        private String nome;
        private String data_nascimento;
        private String premiacoes;
        private String genero;
        //Construtor
        public Artista(String nome, String data_nascimento, String premiacoes, String genero){
                //inicializando variaveis privadas
                this.nome = nome;
                this.data_nascimento = data_nascimento;
                this.premiacoes = premiacoes;
                this.genero = genero;
        }

        //getter e setter
        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getData_nascimento() {
                return data_nascimento;

        }

        public void setData_nascimento(String dataNascimento) {
                this.data_nascimento = dataNascimento;
        }

        public String getPremiacoes() {
                return premiacoes;

        }

        public void setPremiacoes(String premiacoes) {
                this.premiacoes = premiacoes;

        }

        public String getGenero() {
                return genero;

        }

        public void setGenero(String genero) {
                this.genero = genero;

        }

}
