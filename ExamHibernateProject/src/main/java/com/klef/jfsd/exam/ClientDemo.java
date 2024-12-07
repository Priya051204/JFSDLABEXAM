package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) 
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        Vehicle v = new Vehicle();
        v.setName("i20");
        v.setType("Car");
        v.setMaxSpeed(100); // Ensure maxSpeed is set
        v.setColor("Blue");


        Car c = new Car();
        c.setName("Sedan");
        c.setType("Car");
        c.setMaxSpeed(180);
        c.setColor("Red");
        c.setNumberOfDoors(4);

        Truck tru = new Truck();
        tru.setName("Freightliner");
        tru.setType("Truck");
        tru.setMaxSpeed(120);
        tru.setColor("Blue");
        tru.setLoadCapacity(20000);

        session.persist(v);
        session.persist(c);
        session.persist(tru);

        t.commit();

        System.out.println("SUCCESS...");

        session.close();
        sf.close();
    }
}
