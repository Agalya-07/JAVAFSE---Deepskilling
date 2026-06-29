package com.cognizant.ormlearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.util.HibernateUtil;

public class HibernateMain {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();

        Country country = session.get(Country.class, "IN");

        System.out.println(country);

        session.close();
        factory.close();
    }
}