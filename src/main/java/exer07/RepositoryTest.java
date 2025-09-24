package exer07;
public class RepositoryTest {
    public static void main(String[] args) {
        IRepository<ProdutoRepo, Integer> produtoRepo = new InMemoryRepository<>();
        IRepository<FuncionarioRepo, Long> funcionarioRepo = new InMemoryRepository<>();

        produtoRepo.salvar(new ProdutoRepo(1, "Notebook"));
        produtoRepo.salvar(new ProdutoRepo(2, "Mouse"));

        System.out.println("Produtos:");
        produtoRepo.listarTodos().forEach(System.out::println);

        funcionarioRepo.salvar(new FuncionarioRepo(100L, "Ana"));
        funcionarioRepo.salvar(new FuncionarioRepo(200L, "Carlos"));

        System.out.println("\nFuncionários:");
        funcionarioRepo.listarTodos().forEach(System.out::println);

        System.out.println("\nBuscar Produto ID=1: " + produtoRepo.buscarPorId(1).orElse(null));

        produtoRepo.remover(2);
        System.out.println("\nApós remover produto ID=2:");
        produtoRepo.listarTodos().forEach(System.out::println);

        try {
            produtoRepo.remover(99);
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println("\nErro esperado: " + e.getMessage());
        }
    }
}
