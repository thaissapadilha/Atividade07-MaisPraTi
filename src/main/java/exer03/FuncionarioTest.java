package exer03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioTest {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Maria", new BigDecimal("10000")));
        funcionarios.add(new Desenvolvedor("João", new BigDecimal("5000")));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Bônus: " + f.calcularBonus());
        }

        try {
            new Gerente("Carlos", new BigDecimal("-1000"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
