package exer08;
import java.math.BigDecimal;

public class Pedido {
    private final String cepDestino;
    private final BigDecimal valor;
    private CalculadoraFrete estrategiaFrete;

    public Pedido(String cepDestino, BigDecimal valor, CalculadoraFrete estrategiaFrete) {
        if (cepDestino == null || cepDestino.trim().isEmpty()) {
            throw new IllegalArgumentException("CEP inválido.");
        }
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor do pedido inválido.");
        }
        this.cepDestino = cepDestino;
        this.valor = valor;
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal calcularFrete() {
        if (estrategiaFrete == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete definida.");
        }
        return estrategiaFrete.calcular(this);
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setEstrategiaFrete(CalculadoraFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }
}
