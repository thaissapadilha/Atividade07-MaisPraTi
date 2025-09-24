package exer04;

public class Bicicleta implements IMeioTransporte {
    private int velocidade;
    private final int VELOCIDADE_MAXIMA = 50;

    @Override
    public void acelerar(int incremento) {
        if (incremento < 0) {
            throw new IllegalArgumentException("Incremento não pode ser negativo.");
        }
        velocidade += incremento;
        if (velocidade > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
            throw new IllegalStateException("A bicicleta atingiu a velocidade máxima!");
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
            throw new IllegalStateException("A bicicleta já está parada!");
        }
    }

    @Override
    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Bicicleta | velocidade=" + velocidade;
    }
}
