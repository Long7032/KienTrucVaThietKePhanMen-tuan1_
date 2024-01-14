package week.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import week.entity.Product;

@Repository
@Transactional
public class Product_DAO_Imp implements Product_DAO{
	@Autowired
	private SessionFactory sessionFactoty;
	
	@Override
	public List<Product> getListProduct() {
		// TODO Auto-generated method stub
		Session session = sessionFactoty.getCurrentSession();
		return session.createNativeQuery("select * from products", Product.class).getResultList();
	}

	
}
