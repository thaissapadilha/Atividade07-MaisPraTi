package exer06;
import java.math.BigDecimal;
import java.util.ArrayList;

public class CarrinhoTest {
    public static void main(String[] args) {
        ProdutoCarrinho p1 = new ProdutoCarrinho("Notebook", new Dinheiro(new BigDecimal("3500.00"), Moeda.BRL));
        ProdutoCarrinho p2 = new ProdutoCarrinho("Mouse", new Dinheiro(new BigDecimal("150.00"), Moeda.BRL));

        Carrinho carrinho = new Carrinho(new ArrayList<>());

        carrinho = carrinho.adicionarItem(p1, 1);
        carrinho = carrinho.adicionarItem(p2, 2);

        System.out.println(carrinho);

        Carrinho carrinhoComDesconto = carrinho.aplicarCupom(new BigDecimal("0.2"));
        System.out.println("\nCom desconto de 20%:");
        System.out.println(carrinhoComDesconto);

        try {
            carrinho.aplicarCupom(new BigDecimal("0.5"));
        } catch (Exception e) {
            System.out.println("\nErro esperado: " + e.getMessage());
        }
    }
}
