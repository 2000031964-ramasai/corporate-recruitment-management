package com.controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.Company;
import com.model.CompanyRemote;
@ManagedBean(name="comp",eager=true)
public class CompanyService {
	
	  String uname;
	  String email;
	  int pnumber;
	  String password;
	  String location;
	  String response;
	  String guname;
	  String gpassword;
	  @EJB(lookup = "java:global/corporate/CompanyModel!com.model.CompanyRemote")
	  CompanyRemote CR ;
	  public void delete() {
		    try {
		      response=CR.deleteData(uname);
		    }
		    catch(Exception e) {
		      response=e.getMessage();
		    }
		  }
	  public void insert() {
		    try {
		    Company C=new Company();
		    
		    
		    C.setUname(uname);
		    C.setEmail(email);
		    C.setPnumber(pnumber);
		    C.setPassword(password);
		    C.setLocation(location);
		    response=CR.insertData(C);
		    }
		    catch(Exception e) {
		      response=e.getMessage();
		    }
		  }
	  public void find() {
		    try {
		      Company C=CR.findData(uname);
		      guname=C.getUname();
		      gpassword=C.getPassword();
		    }
		    catch(Exception e) {
		      response=e.getMessage();
		    }
		  }
	  public String verify() {
		    find();
		    if(uname.equals(guname)&&password.equals(gpassword)) {
		      return "aftercomp.jsf";
		    }
		    else {
		      return "index.jsf";
		    }
		  }
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getGuname() {
		return guname;
	}
	public void setGuname(String guname) {
		this.guname = guname;
	}
	public String getGpassword() {
		return gpassword;
	}
	public void setGpassword(String gpassword) {
		this.gpassword = gpassword;
	}
}
