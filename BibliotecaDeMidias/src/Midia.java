public class Midia {
    //Atributos
    private String titulo;
    private int ano;
    private String genero;

    //construtor
    public Midia(String titulo,int ano,String genero){
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    //getter e setter
    public String getTitulo(){
        return titulo;
    }
    public String toString(){
        return this.getTitulo();
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){

        this.ano = ano;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}