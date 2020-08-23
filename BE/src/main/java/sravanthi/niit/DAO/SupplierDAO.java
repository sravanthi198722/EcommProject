package sravanthi.niit.DAO;

import java.util.List;

import sravanthi.niit.Model.Supplier;

public interface SupplierDAO {

	public Boolean addSupplier(Supplier supplier);
	public Boolean deleteSupplier(Supplier supplier);
    public Boolean updateSupplier(Supplier supplier);
    public List<Supplier> listSuppliers();
    public Supplier getSupplier(int SupplierId);
    
    
    
    
    
    
}


