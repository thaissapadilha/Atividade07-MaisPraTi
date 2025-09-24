import java.math.BigDecimal;

public class StrategyDemo {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("12345-678", new BigDecimal("500"), new FreteSedex());

        System.out.println("Frete via Sedex: " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FretePac());
        System.out.println("Frete via PAC: " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FreteRetiradaNaLoja());
        System.out.println("Frete via Retirada na Loja: " + pedido.calcularFrete());

        // Estratégia promocional (lambda): frete grátis acima de R$300
        CalculadoraFrete fretePromocional = p -> 
            p.getValor().compareTo(new BigDecimal("300")) > 0 ? BigDecimal.ZERO : new BigDecimal("15");

        pedido.setEstrategiaFrete(fretePromocional);
        System.out.println("Frete Promocional (acima de 300 é grátis): " + pedido.calcularFrete());
    }
}
