package Bsobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private int ano;

    public Anime(String tipo, int episodios, String nome, String genero){
        this.nome = nome;
        this.genero=genero;
        this.tipo=tipo;
        this.episodios=episodios;
    }

    public Anime(String tipo, int episodios, String nome, String genero, int ano){
        this(tipo,episodios,nome,genero);
        this.ano=ano;
    }

    /*public void init(String tipo, int episodios){
        this.tipo=tipo;
        this.episodios=episodios;
    }
    //sobrecarga de metodos é quando eu dou o mesmo nome pra um metodo novo pq eu preciso colocar mais coisas nele!
    public void init(String tipo, int episodios, String nome, String genero){
        this.init(tipo,episodios);
        this.nome=nome;
        this.genero=genero;
    }

     */
    public void imprime(){
        System.out.println(nome+tipo+episodios+genero);
    }
    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
