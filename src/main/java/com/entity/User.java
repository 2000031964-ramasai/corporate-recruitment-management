package com.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="empep")
public class User implements Serializable{
  private static final long serialVersionUID = 1L;
  @Column(name="fname")
  String fname;
  @Column(name="lname")
  String lname;
  @Id
  String uname;
  @Column(name="email")
  String email;
  @Column(name="pnumber")
  int pnumber;
  String password;
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
}