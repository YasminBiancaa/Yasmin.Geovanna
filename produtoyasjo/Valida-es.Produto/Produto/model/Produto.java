package model;


public class Produto {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Produto
    private int preco;  // Atributo privado, acessível somente dentro da classe Produto
    private int quantidade;  // Atributo privado, acessível somente dentro da classe Produto

    // Construtor que recebe nome, preco e quantidade como valores padrão
    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor que recebe nome e preco como valores padrão
    // Inicializa com valores padrão: nome="Produto Padrão", preco=10 e quantidade 1
    public Produto() {
        this.nome = "Produto Padrão";
        this.preco = 10;
        this.quantidade = 1;
    }

    // Método que exibe informações do produto
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + "| Preço: R$" + preco + "| Quantidade: " + quantidade );
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    

    // Retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // Retorna o preco
    public int getPreco() {
        return preco;
    }

    // Retorna o quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Define um novo nome para o produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define um novo preço
    public void setPreco(int preco) {
        this.preco = preco;
    }
  
    // Define uma nova quantidade
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
