package com.mbrindam.hibersimple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	Session session = null;
	
    @Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("setUp running");
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        session = sessionFactory.getCurrentSession();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testPersonCreate()
    {
    	 org.hibernate.Transaction tx = session.beginTransaction();
         
         Person p = new Person();
         p.setFirstName("Michael");
         p.setLastName("Brindamour");
         Long id = (Long) session.save(p);
         
         tx.commit();
         System.out.println("Id = " + id);
         
         assertTrue(id != null);
    }
    
    public void testPerson2Create()
    {
    	 org.hibernate.Transaction tx = session.beginTransaction();
         
         Person p = new Person();
         p.setFirstName("Michael");
         p.setLastName("Brindamour");
         Long id = (Long) session.save(p);
         
         tx.commit();
         
         System.out.println("Id = " + id);
         assertTrue(id != null);
    }
}
