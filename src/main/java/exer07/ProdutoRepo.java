package exer07;
public class ProdutoRepo implements Identificavel<Integer> {
    private final Integer id;
    private final String nome;

    public ProdutoRepo(Integer id, String nome) {
        if (id == null || nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("ID e nome não podem ser nulos/vazios.");
        }
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ProdutoRepo{id=" + id + ", nome='" + nome + "'}";
    }
}
