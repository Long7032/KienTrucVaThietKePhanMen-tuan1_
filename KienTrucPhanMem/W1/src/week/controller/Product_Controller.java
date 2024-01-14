package week.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import week.service.Product_Service;

@Controller
public class Product_Controller {

	@Autowired
	private Product_Service productService;
	
	@RequestMapping("/")
	public String showResult() {
		System.out.println("Home Ok");
		System.out.println(productService.getListProduct());
		return "index";
	}
	
	
}
