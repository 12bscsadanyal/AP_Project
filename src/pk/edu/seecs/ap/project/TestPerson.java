package pk.edu.seecs.ap.project;

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
        List <USERS>list = query.list();
        java.util.Iterator<USERS> iter = list.iterator();
        while (iter.hasNext()) {
          
        	USERS person = iter.next();
          System.out.println("Person: \"" + person.getFirst_Name() +
                          "\", " + person.getLast_Name() +
                          "\", " + person.getE_mail());

        }
        
        session.getTransaction().commit();
		
	}

	public static void createPerson(Session session) {
        USERS person = new USERS();

        person.setFirst_Name("Barak");
        String x;
        person.setLast_Name("Danyal");
        person.setE_mail("Obhama");
        
        person.setOpting("White House");       
        
        session.save(person);
	}
}

