package edu.dmacc.spring.doggychicfoodmarket;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class OrderDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DoggyChicFoodMarket");
	
	public void insertOrder(Order orderToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(orderToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select o from Order o";
		TypedQuery<Order> typedQuery = em.createQuery(q, Order.class);
		List<Order> all = typedQuery.getResultList();
		return all;
	}

}
