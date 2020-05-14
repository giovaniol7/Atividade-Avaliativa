package atividadeavaliativa;

public class Livros {
    
    //Atributos
    private int id;
    private String titulo;
    private String autor;
    private String edicao;
    private String editora;
    private String cidade;
    private int anoPublicacao;

    //Construtor Padrão
    public Livros() {
    }

    //Construtor Sobrecarregado
    public Livros(int id, String titulo, String autor, String edicao, String editora, String cidade, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }

    //Encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    //To String - Para Imprimir
    @Override
    public String toString() {
        return "Id= " + getId() + "\n" +
               "Titulo= " + getTitulo() + "\n" + 
               "Autor= " + getAutor() + "\n" +
               "Edicao= " + getEdicao() + "\n" +
               "Editora= " + getEditora() + "\n" +
               "Cidade= " + getCidade() + "\n" +
               "Ano de Publicacao= " + getAnoPublicacao() + "\n";
    }
   
}
