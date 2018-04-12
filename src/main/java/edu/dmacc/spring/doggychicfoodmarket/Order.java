package edu.dmacc.spring.doggychicfoodmarket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dogfoodsales")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "custId")
	private Customer custId;
	@ManyToOne
	@JoinColumn(name = "dogFoodId")
	private DogFood dogFoodId;
	private int quantity;


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Customer getCustId() {
		return custId;
	}


	public void setCustId(Customer custId) {
		this.custId = custId;
	}


	public DogFood getDogFoodId() {
		return dogFoodId;
	}


	public void setDogFoodId(DogFood dogFoodId) {
		this.dogFoodId = dogFoodId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



}
