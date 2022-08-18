package com.model;
import javax.ejb.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.*;
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class CompProfModel implements CompProfRemote{

  @Override
  public String insertData(CompProf CP) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(CP);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return "Profile Update successfully..";
  }

  @Override
  public CompProf findData(String uname) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    CompProf CP=em.find(CompProf.class, uname);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return CP;
  }

  @Override
  public String deleteData(String uname) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    User U=em.find(User.class, uname);
    em.remove(U);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return "Record deleted ...";
  }









}