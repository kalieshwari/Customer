package com.iproximus.tidinow.customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iproximus.tidinow.customer.Repository.CustomerRepository;
import com.iproximus.tidinow.customer.Model.Customer;

@Controller
public class CustomerController {
	@Autowired
	CustomerRepository repository;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		repository.save(customer);
		return"home.jsp";
	}
	@RequestMapping("/getCustomer")
	public ModelAndView getCustomer(@RequestParam String qualification) {
		ModelAndView mv = new ModelAndView("show.jsp");
		Customer customer = repository.findByQualification(qualification);
		mv.addObject(customer);
		return mv;
	}
	/*<dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
        <scope>provided</scope>
    </dependency>
*/
}
