package exer07;
import java.util.*;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {

    private final Map<ID, T> store = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        store.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<T> listarTodos() {
        return Collections.unmodifiableList(new ArrayList<>(store.values()));
    }

    @Override
    public void remover(ID id) {
        if (!store.containsKey(id)) {
            throw new EntidadeNaoEncontradaException("Entidade com ID " + id + " não encontrada.");
        }
        store.remove(id);
    }
}
