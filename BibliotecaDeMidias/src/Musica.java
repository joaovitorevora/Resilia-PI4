public class Musica extends Midia {
    private int duracao;
    private String artista;
    private int notas;

    public Musica (String titulo,int ano,String genero,int duracao,String artista,int notas){
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.artista = artista;
        this.notas = notas;
    }

    //getter e setter
    public int getDuracao(){
        return duracao;
    }

    //getter e setter
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas){
        if(notas <1 || notas >5){
            throw new IllegalArgumentException("valor da nota esta abaixo ou acima de 5");
        }
        else {
            this.notas = notas;
        }
    }
}