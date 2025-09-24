package exer07;
public class FuncionarioRepo implements Identificavel<Long> {
    private final Long id;
    private final String nome;

    public FuncionarioRepo(Long id, String nome) {
        if (id == null || nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("ID e nome não podem ser nulos/vazios.");
        }
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "FuncionarioRepo{id=" + id + ", nome='" + nome + "'}";
    }
}
