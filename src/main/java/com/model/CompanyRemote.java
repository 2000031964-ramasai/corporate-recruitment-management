package com.model;
import javax.ejb.Remote;
import com.entity.*;
@Remote
public interface CompanyRemote {
	 public String insertData(Company C)throws Exception;
	  public Company findData(String uname)throws Exception;
	  public String deleteData(String uname)throws Exception;
}
