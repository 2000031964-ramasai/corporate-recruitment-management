package com.controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.Profile;

import com.model.ProfileRemote;

@ManagedBean(name="prof",eager=true)
public class ProfileService {
  String uname;
  String fname;
  String lname;
  
  int workingexp;
  String skills;
 
  String response;
  String guname;
 
  @EJB(lookup = "java:global/corporate/ProfileModel!com.model.ProfileRemote")
  ProfileRemote PR;
  public void delete() {
    try {
      response=PR.deleteData(uname);
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
  public void insert() {
    try {
    	
    Profile P=new Profile();
    P.setUname(uname);
    P.setFname(fname);
    P.setLname(lname);
    
    P.setWorkingexp(workingexp);
    P.setSkills(skills);
   
    response=PR.insertData(P);
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
  /*
  public void find() {
    try {
      User U=UR.findData(uname);
      guname=U.getUname();
      gpassword=U.getPassword();
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
  public String verify() {
    find();
    if(uname.equals(guname)&&password.equals(gpassword)) {
      return "after.jsf";
    }
    else {
      return "index.jsf";
    }
  }*/
 /* public String verifyadmin() {
    if(uname.equals("admin")&&password.equals("admin")) {
      return "admin";
    }
    else 
    {
      return "index";    
    }
  }*/
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getWorkingexp() {
	return workingexp;
}
public void setWorkingexp(int workingexp) {
	this.workingexp = workingexp;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
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
public ProfileRemote getPR() {
	return PR;
}
public void setPR(ProfileRemote pR) {
	PR = pR;
}

}