public class Musico extends Artista {
    private String atuacao;

    public Musico(String nome, String data_nascimento, String premiacoes, String genero, String atuacao){
        //super é utilizado para chamar o construtor da classe pai
        super(nome,data_nascimento,premiacoes,genero);
        this.atuacao = atuacao;
    }

    //getter e setter
    public String getAtuacao(){

        return atuacao;
    }

    public void setAtuacao(String atuacao){

        this.atuacao = atuacao;
    }


}