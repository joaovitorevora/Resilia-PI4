public class Ator extends Artista {
    private String formacao;

    public Ator(String nome, String data_nascimento, String premiacoes, String genero, String formacao){
        //super é utilizado para chamar os atributos da classe pai
        super(nome,data_nascimento,premiacoes,genero);
        this.formacao = formacao;
    }
}
