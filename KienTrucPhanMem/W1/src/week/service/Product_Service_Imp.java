package week.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import week.dao.Product_DAO;
import week.entity.Product;

@Service
public class Product_Service_Imp implements Product_Service{
	@Autowired
	private Product_DAO productDAO;
	
	@Override
	@Transactional
	public List<Product> getListProduct() {
		// TODO Auto-generated method stub
		return productDAO.getListProduct();
	}
	
	
}
