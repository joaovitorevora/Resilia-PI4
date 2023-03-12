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
}