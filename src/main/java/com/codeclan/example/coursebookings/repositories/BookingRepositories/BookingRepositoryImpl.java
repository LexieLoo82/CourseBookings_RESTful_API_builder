package com.codeclan.example.coursebookings.repositories.BookingRepositories;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    public List<Booking> findAllBookingsByDate(String date){
        List<Booking> results = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

}
