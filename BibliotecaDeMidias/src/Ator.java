public class Ator extends Artista {
    //Atributos
    private String formacao;
    //Construtor
    public Ator(String nome, String data_nascimento, String premiacoes, String genero, String formacao){
        //super é utilizado para chamar o construtor da classe pai (superclasse)
        super(nome,data_nascimento,premiacoes,genero);
        this.formacao = formacao;
    }
    //getter e setter

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }


}
