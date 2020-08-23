package sravanthi.niit.DAO;

import java.util.List;

import sravanthi.niit.Model.Category;

public interface CategoryDaoIntf {
	
	public boolean addCategory(Category category);
    public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	public Category getCategory(int categoryId);
	public List<Category> listcategories();

}


