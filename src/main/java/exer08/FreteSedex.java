package exer08;
import java.math.BigDecimal;

public class FreteSedex implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.05")).add(new BigDecimal("20"));
    }
}

