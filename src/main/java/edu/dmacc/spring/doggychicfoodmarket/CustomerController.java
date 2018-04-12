package edu.dmacc.spring.doggychicfoodmarket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired 
	CustomerDao dao;
	OrderDao oDao;
// REMOVE IF YOU DON'T USE	private static final String[] make = { "Audi", "Buick", "Chrysler", "Cadillac", "Dodge", "Ford", "GMC", "Jeep", "Lexus", "Mitubishi"};

	@RequestMapping(value = "/form")
	public ModelAndView customers() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("customerForm");
		modelAndView.addObject("customer", new Customer());
	//	modelAndView.addObject("make", make);

		return modelAndView;
	}
	
	@RequestMapping(value = "/orderForm")
	public ModelAndView orders() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orderForm");
		modelAndView.addObject("order", new Order());

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processCustomers(Customer customer) {
		ModelAndView modelAndView = new ModelAndView();
		dao.insertCustomer(customer);
		modelAndView.setViewName("customerResult");
		modelAndView.addObject("c", customer);

		return modelAndView;
	}
	
	@RequestMapping(value = "/orderResult")
	public ModelAndView processOrders(Order order) {
		ModelAndView modelAndView = new ModelAndView();
		oDao.insertOrder(order);
		modelAndView.setViewName("orderResult");
		modelAndView.addObject("o", order);

		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> allCustomers = dao.getAllCustomers();
		modelAndView.setViewName("viewAllCustomers");
		modelAndView.addObject("all", allCustomers);
		return modelAndView;

	}
	@RequestMapping(value = "/viewAllOrders")
	public ModelAndView viewAllOrders() {
		ModelAndView modelAndView = new ModelAndView();
		List<Order> allOrders = oDao.getAllOrders();
		modelAndView.setViewName("viewAllOrders");
		modelAndView.addObject("all", allOrders);
		return modelAndView;

	}

	@Bean
	public OrderDao oDao() {
		OrderDao bean = new OrderDao();
		return bean;
	}

	@Bean
	public CustomerDao dao() {
		CustomerDao bean = new CustomerDao();
		return bean;
	}
}