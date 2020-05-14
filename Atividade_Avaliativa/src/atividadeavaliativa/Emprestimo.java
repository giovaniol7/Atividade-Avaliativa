package atividadeavaliativa;

//Biblioteca LocalDate
import java.time.LocalDate;

public class Emprestimo {

    //Atributos
    private int id;
    private int idUsuario;
    private int idLivro;
    private LocalDate dataEmprestimo;           //LocalDate para pegar a data do computador
    private LocalDate dataDevolucao;            //LocalDate para pegar a data do computador
    private boolean devolvido;                  //Boolean atributo para Verdadeiro ou Falso

    //Construtor Padrão
    public Emprestimo() {
    }
  
    //Contrutor Sobrecarregado
    public Emprestimo(int id, int idUsuario, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean devolvido) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.devolvido = devolvido;
    }

    //Encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public LocalDate getDataEmprestimo() {
        return LocalDate.now();
    }
    
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return LocalDate.now();
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    //To String - Para Imprimir
    @Override
    public String toString() {
        return 
               "Id= " + getId() + "\n" +
               "Id do Usuario= " + getIdUsuario() + "\n" + 
               "Id do Livro= " + getIdLivro() + "\n" + 
               "Data de Emprestimo= " + getDataEmprestimo() + "\n" + 
               "Data de Devolucao= " + getDataDevolucao() + "\n" + 
               "Devolvido= " + isDevolvido() + "\n";
    }
    
    
    
}
