package exer06;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Carrinho adicionarItem(ProdutoCarrinho produto, int quantidade) {
        List<ItemCarrinho> novaLista = new ArrayList<>(itens);
        novaLista.add(new ItemCarrinho(produto, quantidade));
        return new Carrinho(novaLista);
    }

    public Carrinho removerItem(ProdutoCarrinho produto) {
        List<ItemCarrinho> novaLista = new ArrayList<>();
        for (ItemCarrinho item : itens) {
            if (!item.getProduto().equals(produto)) {
                novaLista.add(item);
            }
        }
        return new Carrinho(novaLista);
    }

    public Carrinho aplicarCupom(BigDecimal percentual) {
        List<ItemCarrinho> novaLista = new ArrayList<>();
        for (ItemCarrinho item : itens) {
            Dinheiro precoComDesconto = item.getProduto().getPreco().aplicarDesconto(percentual);
            ProdutoCarrinho produtoComDesconto = new ProdutoCarrinho(item.getProduto().getNome(), precoComDesconto);
            novaLista.add(new ItemCarrinho(produtoComDesconto, item.getQuantidade()));
        }
        return new Carrinho(novaLista);
    }

    public Dinheiro calcularTotal() {
        BigDecimal soma = BigDecimal.ZERO;
        Moeda moeda = null;
        for (ItemCarrinho item : itens) {
            if (moeda == null) moeda = item.getTotal().getMoeda();
            soma = soma.add(item.getTotal().getValor());
        }
        return new Dinheiro(soma, moeda != null ? moeda : Moeda.BRL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carrinho:\n");
        for (ItemCarrinho item : itens) {
            sb.append(" - ").append(item).append("\n");
        }
        sb.append("Total: ").append(calcularTotal());
        return sb.toString();
    }
}
