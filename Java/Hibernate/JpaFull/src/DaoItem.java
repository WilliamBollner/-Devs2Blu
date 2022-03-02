import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoItem {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public DaoItem() {
		emf = Persistence.createEntityManagerFactory("JPAPU");
		em = emf.createEntityManager();
	}
	
	public void salvar(Item item) {
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		}
	
}
