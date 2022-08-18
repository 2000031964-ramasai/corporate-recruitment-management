package com.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="compprofile")
public class CompProf implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id
  @Column(name="uname")
  String uname;
  @Column(name="location")
  String location;
  @Column(name="no_emp")
  int no_emp;
  @Column(name="vacancies")
 int vacancies;
 
  
  @Column(name="workexpreq")
  int workingexpreq;
  @Column(name="skillsreq")
  String skillsreq;
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
  
}