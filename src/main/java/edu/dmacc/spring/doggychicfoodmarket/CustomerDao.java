package edu.dmacc.spring.doggychicfoodmarket;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomerDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DoggyChicFoodMarket");
	
	public void insertCustomer(Customer customerToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(customerToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select c from Customer c";
		TypedQuery<Customer> typedQuery = em.createQuery(q, Customer.class);
		List<Customer> all = typedQuery.getResultList();
		return all;
	}

}
