package atividadeavaliativa;

//BiBliotecas
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Biblioteca {

    public static void main(String[] args) {
        
        int opcMenu;
        
        //Criando Lista
        List<Usuario> usuario = new ArrayList<>();
        List<Livros> livros = new ArrayList<>();
        List<Emprestimo> emprestimo = new ArrayList<>();
                     
        do{
            //Menu
            opcMenu = Integer.parseInt (JOptionPane.showInputDialog (
                    "1 - Inserir Usuário\n" +
                    "2 - Procurar Usuário\n" +
                    "3 - Listar Todos os Usuário\n" +
                    "4 - Inserir Livro\n" +
                    "5 - Procurar Livro\n" +
                    "6 - Listar Todos o Livros\n" +
                    "7 - Pegar Livro Emprestado\n" +
                    "8 - Devolver Livro Emprestado\n" +
                    "9 - Mostrar Livros Não Devolvidos\n" +
                    "10- Mostrar Livros Devolvidos\n" +
                    "0 - Sair\n" +
                    "Informe a Opcao do Menu: "));
            
            //Opcao 1 - Inserir Usuario
            if (opcMenu == 1){
                int id;
                String nome;
                String email;
                String senha;
                id = Integer.parseInt (JOptionPane.showInputDialog ("Id do Usuário: "));
                nome = JOptionPane.showInputDialog("Nome do Usuário: ");          
                email = JOptionPane.showInputDialog("Email do Usuário: ");
                senha = JOptionPane.showInputDialog("Senha: ");
                usuario.add(new Usuario( id, nome.toUpperCase(), email, senha));
            }
            
            //Opcao 2 - Procurar Usuario por Nome
            if (opcMenu == 2){
                String nome;
                nome = JOptionPane.showInputDialog("Nome do Usuário para Procurar: ");
                nome = nome.toUpperCase();
                //Procurar e Imprimir Usuário
                for (Usuario u : usuario) {
                    if (u.getNome().equals(nome)) {
                            JOptionPane.showMessageDialog(null ,u , "Usuário", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    //Erro Se Não Achar o Usuário
                    else{
                        JOptionPane.showMessageDialog(
                            null,
                            "Não Existe Esse Usuário Cadastrado!",
                            "Mensagem de Alerta",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            }
            
            //Opcao 3 - Imprimir Todos os Usuarios
            if (opcMenu == 3){
                System.out.println("Usuários:");
                for(Usuario u : usuario) {
                    System.out.println(u);
                }          
            }
            
            //Opcao 4 - Inserir Livro
            if (opcMenu == 4){
                int id;
                String titulo;
                String autor;
                String edicao;
                String editora;
                String cidade;
                int anoPublicacao;
                id = Integer.parseInt (JOptionPane.showInputDialog ("Id do Livro: "));
                titulo = JOptionPane.showInputDialog("Titulo do Livro: ");          
                autor = JOptionPane.showInputDialog("Autor do Livro: ");
                edicao = JOptionPane.showInputDialog("Edição: ");
                editora = JOptionPane.showInputDialog("Editora: ");
                cidade = JOptionPane.showInputDialog("Cidade: ");
                anoPublicacao = Integer.parseInt (JOptionPane.showInputDialog ("Ano de Publicação: "));
                livros.add(new Livros( id, titulo.toUpperCase(), autor.toUpperCase(), edicao, editora, cidade, anoPublicacao));
            }
            
            //Opcao 5 - Procurar Livro por ID
            if (opcMenu == 5){
                int id;
                id = Integer.parseInt(JOptionPane.showInputDialog("Id do Livro para Procurar: "));
                for (Livros l : livros) {
                    if (l.getId() == id) {
                            JOptionPane.showMessageDialog(null ,l , "Livro", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    //Erro Se Não Achar o Livro
                    else{
                        JOptionPane.showMessageDialog(
                            null,
                            "Não Existe Esse Livro Cadastrado!",
                            "Mensagem de Alerta",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }                            
            }
            
            //Opcao 6 - Imprimir Todos os Livros
            if (opcMenu == 6){
                System.out.println("Livros:");
                for(Livros l : livros) {
                    System.out.println(l);    
                }               
            }
            
            //Opcao 7 - Realizar Emprestimo
            if (opcMenu == 7){
                int aux=0;
                String senha;
                int id;
                int idUsuario;
                int idLivro;
                idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Id do Usuário: "));
                for (Usuario u : usuario) {
                    //Digitar o ID Usario para verificar se existe na lista para pegar o emprestimo do livro
                    if (u.getId() == idUsuario) {
                        senha = JOptionPane.showInputDialog("Senha do Usuário: ");
                        //Verifica se a senha do Usuario está certa para pegar emprestado o livro    
                        if (u.getSenha().equals(senha)){
                            aux = 2;
                            break;
                        }   
                        break;
                    }
                }
                //Se o usuario e senha estiver correto e existir, e ai fazer o emprestimo
                if (aux == 2){
                    LocalDate dataEmprestimo = LocalDate.now();
                    LocalDate dataDevolucao = LocalDate.now();
                    boolean devolvido;
                    idLivro = Integer.parseInt (JOptionPane.showInputDialog("Id do Livro: "));
                    for (Livros l : livros) {
                        //verificar se existe o livro na lista
                        if (l.getId() == idLivro){
                            aux = 3;
                            break;
                        }
                    }
                    //Se o livro digitado existe, ele realizará o emprestimo
                    if (aux == 3){
                        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        id = Integer.parseInt (JOptionPane.showInputDialog ("Id do Emprestimo: "));       
                        emprestimo.add(new Emprestimo(id, idUsuario, idLivro, dataEmprestimo, dataDevolucao, false)); 
                    }
                    //se o livro não existe exibe mensagem de erro
                    else {
                        JOptionPane.showMessageDialog(
                            null,
                            "Livro Não Encontrado!",
                            "Mensagem de Alerta",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } 
                //se o usario digitou a senha ou o id errado ou se o usuario não existe exibe mensagem de erro
                else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Senha ou Usuário Invalidos!",
                        "Mensagem de Alerta",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            
            //Opcao 8 - Devolver Livro
            if (opcMenu == 8){
                int aux=0;
                String senha;
                int id;
                int idUsuario;
                int idLivro;
                idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Id do Usuário: "));
                for (Usuario u : usuario) {
                    //verifica se o usuario digitado está na lista
                    if (u.getId() == idUsuario) {
                        senha = JOptionPane.showInputDialog("Senha do Usuário: ");
                        //Verifica se a senha do usuario está certo
                        if (u.getSenha().equals(senha)){
                            aux = 2;
                            break;
                        }   
                        break;
                    }
                }
                //se a senha e o usuario estiver correto o usuario podera dar a devolução do livro
                if (aux == 2){
                    LocalDate dataDevolucao = LocalDate.now();
                    boolean devolvido;
                    DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    idLivro = Integer.parseInt (JOptionPane.showInputDialog("Id do Livro: "));
                    for (Emprestimo e : emprestimo) {
                        //verifica se o livro digitado existe e se está realmente emprestado
                        if (e.getIdLivro() == idLivro){
                            e.setDataDevolucao(dataDevolucao);
                            e.setDevolvido(true);
                            JOptionPane.showMessageDialog(
                                null,
                                "Livro Devolvido Com Sucesso!",
                                "Mensagem de Aviso",
                                JOptionPane.INFORMATION_MESSAGE
                            );
                            break;
                        }
                        //Se o livro não está na lista mostra essa mensagem de erro
                        else{
                            JOptionPane.showMessageDialog(
                                null,
                                "Senha ou Usuário Invalidos!",
                                "Mensagem de Alerta",
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    }
                } 
                //se o usuario ou senha está errado mostra essa mensagem de erro
                else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Senha ou Usuário Invalidos!",
                        "Mensagem de Alerta",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            
            //Opcao 9 - Listar Livros Emprestados Não Devolvido
            if (opcMenu == 9){
                boolean devolvido;
                for (Emprestimo e : emprestimo) {
                    if (e.isDevolvido() == false) {
                            System.out.println(e);
                            break;
                    }
                    //se não possuir livro que não foi devolvido mostra mensagem de erro
                    else{
                        JOptionPane.showMessageDialog(
                            null,
                            "Emprestimo Não Encontrado!",
                            "Mensagem de Alerta",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } 
            }
            
            //Opcao 10 - Listar Todos os Livros Devolvidos
            if (opcMenu == 10){
               boolean devolvido;
                for (Emprestimo e : emprestimo) {
                    if (e.isDevolvido() == true) {
                            System.out.println(e);
                            break;
                    }
                    //se não possuir livro devolvido mostra mensagem de erro
                    else{
                        JOptionPane.showMessageDialog(
                            null,
                            "Emprestimo Não Encontrado!",
                            "Mensagem de Alerta",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }                               
            }
            
            //se caso o usuario digita uma opção que não está no menu aparecerá mensagem de erro
            if (opcMenu != 1 && opcMenu != 2 && opcMenu != 3 && opcMenu != 4 && opcMenu != 5 && opcMenu != 6 && opcMenu != 7 && opcMenu != 8 && opcMenu != 9 && opcMenu != 10 && opcMenu != 0){
                JOptionPane.showMessageDialog(
                        null,
                        "Você Digitou um Número Inválido!",
                        "Mensagem de Alerta",
                        JOptionPane.ERROR_MESSAGE
                    );
            }
        }while(opcMenu != 0);
    }
}