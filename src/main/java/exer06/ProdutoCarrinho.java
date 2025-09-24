package exer06;
public class ProdutoCarrinho {
    private final String nome;
    private final Dinheiro preco;

    public ProdutoCarrinho(String nome, Dinheiro preco) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}
