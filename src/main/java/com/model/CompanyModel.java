package com.model;
import javax.ejb.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.*;
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class CompanyModel implements CompanyRemote{

	@Override
	public String insertData(Company C) throws Exception {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(C);
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	    return "Registration Successful Please Login...";
		
	}

	@Override
	public Company findData(String uname) throws Exception {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    Company C=em.find(Company.class, uname);
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	    return C;
		
	}

	@Override
	public String deleteData(String uname) throws Exception {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("corporate");
		    EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();
		   Company C=em.find(Company.class, uname);
		    em.remove(C);
		    em.getTransaction().commit();
		    em.close();
		    emf.close();
		    return "Record deleted ...";
	}

}
