package com.model;
import javax.ejb.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.*;
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class UserModel implements UserRemote{

  @Override
  public String insertData(User U) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(U);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return "Registration Successful Please Login...";
  }

  @Override
  public User findData(String uname) throws Exception {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    User U=em.find(User.class, uname);
    em.getTransaction().commit();
    em.close();
    emf.close();
    return U;
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