package com.mbrindam.hibersimple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * This is an extremely simple app that demonstrates hibernate annotations, auto-ddl
 * and a few simple hibernate calls.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        Person p = new Person();
        p.setFirstName("Michael");
        p.setLastName("Brindamour");
        Long id = (Long) session.save(p);
        
        Person p2 = new Person();
        p2.setFirstName("Emily");
        p2.setLastName("Brindamour");
        Long id2 = (Long) session.save(p2);
        
        Person p3 = new Person();
        p3.setFirstName("Isaiah");
        p3.setLastName("Nazario");
        Long id3 = (Long) session.save(p3);
        
        
        tx.commit();
        
        System.out.println("Id == " + id);
        System.out.println("Id2 == " + id2);
        System.out.println("Id3 == " + id3);
        
        
    }
}
