package exer08;
import java.math.BigDecimal;

public class FretePac implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.02")).add(new BigDecimal("10"));
    }
}
