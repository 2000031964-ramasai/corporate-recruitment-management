package com.controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.CompProf;
import com.entity.Profile;
import com.model.CompProfRemote;
import com.model.ProfileRemote;

@ManagedBean(name="compprof",eager=true)
public class CompProfService {
  String uname;
  String location;
  int no_emp;
  int vacancies;
  int workingexpreq;
  String skillsreq;
 
  String response;
  String guname;
 
  @EJB(lookup = "java:global/corporate/CompProfModel!com.model.CompProfRemote")
  CompProfRemote CPR;
  public void delete() {
    try {
      response=CPR.deleteData(uname);
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
  public void insert() {
    try {
    	
    CompProf CP=new CompProf();
    CP.setUname(uname);
    CP.setLocation(location);
  CP.setNo_emp(no_emp);
  CP.setVacancies(vacancies);
  CP.setWorkingexpreq(workingexpreq);
  CP.setSkillsreq(skillsreq);
    
    
    
   
    response=CPR.insertData(CP);
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNo_emp() {
	return no_emp;
}
public void setNo_emp(int no_emp) {
	this.no_emp = no_emp;
}
public int getVacancies() {
	return vacancies;
}
public void setVacancies(int vacancies) {
	this.vacancies = vacancies;
}
public int getWorkingexpreq() {
	return workingexpreq;
}
public void setWorkingexpreq(int workingexpreq) {
	this.workingexpreq = workingexpreq;
}
public String getSkillsreq() {
	return skillsreq;
}
public void setSkillsreq(String skillsreq) {
	this.skillsreq = skillsreq;
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
public CompProfRemote getCPR() {
	return CPR;
}
public void setCPR(CompProfRemote cPR) {
	CPR = cPR;
}

}