package com.sample;

import java.util.List;
 
import org.hibernate.Query;
import org.hibernate.Session;
 

public class TestPerson {
  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().getCurrentSession();
		
		 session.beginTransaction();

         createPerson(session);
          
         queryPerson(session);


        System.out.println("done");
	}

	private static void queryPerson(Session session) {
        Query query = session.createQuery("from Person");                 
        List <Person>list = query.list();
        java.util.Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
          
        	Person person = iter.next();
          System.out.println("Person: \"" + person.getName() +
                          "\", " + person.getSurname() +
                          "\", " + person.getAddress());

        }
        
        session.getTransaction().commit();
		
	}

	public static void createPerson(Session session) {
        Person person = new Person();

        person.setName("Barak");
        int x=10;
        person.setId(x);
        person.setSurname("Obhama");
        
        person.setAddress("White House");       
        
        session.save(person);
	}
}

