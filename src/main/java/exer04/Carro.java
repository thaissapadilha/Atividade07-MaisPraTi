package exer04;
public class Carro implements IMeioTransporte {
    private int velocidade;
    private final int VELOCIDADE_MAXIMA = 200;

    @Override
    public void acelerar(int incremento) {
        if (incremento < 0) {
            throw new IllegalArgumentException("Incremento não pode ser negativo.");
        }
        velocidade += incremento;
        if (velocidade > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
            throw new IllegalStateException("O carro atingiu a velocidade máxima!");
        }
    }

    @Override
    public void frear(int decremento) {
        if (decremento < 0) {
            throw new IllegalArgumentException("Decremento não pode ser negativo.");
        }
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
            throw new IllegalStateException("O carro já está parado!");
        }
    }

    @Override
    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Carro | velocidade=" + velocidade;
    }
}
