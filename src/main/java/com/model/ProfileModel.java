package com.model;
import javax.ejb.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.*;
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class ProfileModel implements ProfileRemote{

  @Override
  public String insertData(Profile P) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(P);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return "Profile Update successfully..";
  }

  @Override
  public Profile findData(String uname) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    Profile P=em.find(Profile.class, uname);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return P;
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