package entidadesDao;

import java.util.List;

public interface InterfaceDao<T> {

	public boolean inserir(T t);
	public boolean alterar(T t);
	public boolean excluir(int id);
	public T pesquisarUm(int id);
	public List<T> pesquisar();
	
}
