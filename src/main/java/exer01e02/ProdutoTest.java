package exer01e02;

public class ProdutoTest {
    public static void main(String[] args) {
        // Exer 01: Encapsulamento e validações
        try {
            Produto p1 = new Produto("Notebook", 3000.0, 10);
            System.out.println("Produto criado: " + p1);
            p1.setPreco(2800.0);
            p1.setQuantidadeEmEstoque(8);
            System.out.println("Após alterações: " + p1);

            try {
                p1.setPreco(-100.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro esperado (preço inválido): " + e.getMessage());
            }

            try {
                p1.setNome("");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro esperado (nome vazio): " + e.getMessage());
            }

            //Exer 02: Aplicar desconto
            try {
                p1.aplicarDesconto(10); // 10% de desconto
                System.out.println("Preço com 10% de desconto: " + p1.getPreco());
            } catch (DescontoInvalidoException e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }

            try {
                p1.aplicarDesconto(60);
            } catch (DescontoInvalidoException e) {
                System.out.println("Erro esperado (desconto inválido): " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado ao criar produto: " + e.getMessage());
        }
    }
}
