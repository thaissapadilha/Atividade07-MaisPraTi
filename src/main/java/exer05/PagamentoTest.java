package exer05;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PagamentoTest {
    public static void main(String[] args) {
        List<FormaDePagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito("1234567890123456"));
        pagamentos.add(new Boleto("12345678901234567890123456789012345678901234567"));
        pagamentos.add(new Pix("meuemail@teste.com"));
        pagamentos.add(new CartaoCredito("123"));

        for (FormaDePagamento pagamento : pagamentos) {
            try {
                pagamento.processarPagamento(new BigDecimal("150.00"));
            } catch (PagamentoInvalidoException e) {
                System.out.println("Erro ao processar: " + e.getMessage());
            }
            System.out.println("--------------------");
        }
    }
}
