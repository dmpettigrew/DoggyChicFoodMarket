/*package edu.dmacc.spring.doggychicfoodmarket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@Autowired OrderDao dao;
// REMOVE IF YOU DON'T USE	private static final String[] make = { "Audi", "Buick", "Chrysler", "Cadillac", "Dodge", "Ford", "GMC", "Jeep", "Lexus", "Mitubishi"};

	@RequestMapping(value = "/form")
	public ModelAndView orders() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orderForm");
		modelAndView.addObject("order", new Order());
	//	modelAndView.addObject("make", make);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processOrders(Order order) {
		ModelAndView modelAndView = new ModelAndView();
		dao.insertOrder(order);
		modelAndView.setViewName("orderResult");
		modelAndView.addObject("o", order);

		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Order> allOrders = dao.getAllOrders();
		modelAndView.setViewName("viewAllOrders");
		modelAndView.addObject("all", allOrders);
		return modelAndView;

	}

	@Bean
	public OrderDao dao() {
		OrderDao bean = new OrderDao();
		return bean;
	}
}*/