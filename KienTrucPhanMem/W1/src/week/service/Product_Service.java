package week.service;

import java.util.List;

import org.springframework.stereotype.Service;

import week.entity.Product;

@Service
public interface Product_Service {
	public List<Product> getListProduct();
}
