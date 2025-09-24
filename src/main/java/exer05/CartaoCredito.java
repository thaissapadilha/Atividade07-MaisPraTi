package exer05;
import java.math.BigDecimal;

public class CartaoCredito extends FormaDePagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validarPagamento() {
        if (numeroCartao == null || numeroCartao.length() != 16) {
            throw new PagamentoInvalidoException("Número de cartão inválido (precisa ter 16 dígitos).");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        validarPagamento();
        System.out.println("Pagamento de R$" + valor + " realizado no Cartão de Crédito: " + numeroCartao);
    }
}
