package sravanthi.niit.DAO;

import sravanthi.niit.Model.UserDetail;

public interface UserDaoIntf {
	
	
	public boolean registerUser(UserDetail userDetail);
	
	public boolean updateUser(UserDetail userDetail);
	
    public UserDetail getUser(String userName);
	
	
	
}
