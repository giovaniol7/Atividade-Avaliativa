package projetopráticoavaliativoii;

public class Imovel {
    
    //Atributos
    private String nome;
    private String descricao;
    private String tipo;
    private String categoria;
    private String vendas;

    //Contrutor Padrão
    public Imovel() {
    }

    //Contrutor Sobrecarregado
    public Imovel(String nome, String descricao, String tipo, String categoria, String vendas) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.categoria = categoria;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVendas() {
        return vendas;
    }

    public void setVendas(String vendas) {
        this.vendas = vendas;
    }
    
    //To String - Para Imprimir
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
               "Descrição: " + getDescricao() + "\n" +
               "Categoria: " + getCategoria() + "\n" +
               "Tipo: " + getTipo() + "\n" +
               "Valor: " + getVendas() + "\n";
    }
    
}
