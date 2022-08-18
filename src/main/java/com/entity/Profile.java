package com.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="profile")
public class Profile implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id
  @Column(name="uname")
  String uname;
  @Column(name="fname")
  String fname;
  @Column(name="lname")
  String lname;
 
  
  @Column(name="workingexp")
  int workingexp;
  @Column(name="skills")
  String skills;
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
 
 
}