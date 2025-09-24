package exer05;
import java.math.BigDecimal;

public class Boleto extends FormaDePagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void validarPagamento() {
        if (codigoBarras == null || codigoBarras.length() != 47) {
            throw new PagamentoInvalidoException("Código de barras inválido (precisa ter 47 dígitos).");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        validarPagamento();
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto: " + codigoBarras);
    }
}
