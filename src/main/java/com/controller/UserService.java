package com.controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.entity.User;
import com.model.UserRemote;
@ManagedBean(name="user",eager=true)
public class UserService {
  String fname;
  String lname;
  String uname;
  String email;
  int pnumber;
  String password;
  String response;
  String guname;
  String gpassword;
  @EJB(lookup = "java:global/corporate/UserModel!com.model.UserRemote")
  UserRemote UR;
  public void delete() {
    try {
      response=UR.deleteData(uname);
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
  public void insert() {
    try {
    User U=new User();
    U.setFname(fname);
    U.setLname(lname);
    U.setUname(uname);
    U.setEmail(email);
    U.setPnumber(pnumber);
    U.setPassword(password);
    response=UR.insertData(U);
    }
    catch(Exception e) {
      response=e.getMessage();
    }
  }
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
  }
 /* public String verifyadmin() {
    if(uname.equals("admin")&&password.equals("admin")) {
      return "admin";
    }
    else 
    {
      return "index";    
    }
  }*/
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