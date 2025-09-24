package exer05;
import java.math.BigDecimal;

public abstract class FormaDePagamento {

    public abstract void validarPagamento();
    public abstract void processarPagamento(BigDecimal valor);

}
