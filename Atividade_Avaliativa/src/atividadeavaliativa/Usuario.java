package atividadeavaliativa;

public class Usuario {
    
    //Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;

    //Contrutor Psdrão
    public Usuario() {
    }

    //Contrutor Sobrecarregado
    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    //Encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //To String - Para Imprimir
    @Override
    public String toString(){
        return "Id: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Email: " + getEmail() + "\n";
    }

    boolean contains(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
