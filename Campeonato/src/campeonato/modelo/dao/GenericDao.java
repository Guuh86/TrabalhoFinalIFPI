package campeonato.modelo.dao;

import java.util.List;

public interface GenericDao<E> {
	
	public void insert(E e); // Create
	
	public E select(long id); // Read
	public List<E> select(); // Read
	
	public void update(E e); // Update
	public void delete(E e); // Delete
	
	

}
