package sravanthi.niit.DAO;

import java.util.List;

import sravanthi.niit.Model.Product;



public interface ProductDaoIntf {
	
	
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product );
	public boolean updateProduct(Product  product );
	public Product getProduct(int productId);
	public List<Product> listProducts();
}
	


