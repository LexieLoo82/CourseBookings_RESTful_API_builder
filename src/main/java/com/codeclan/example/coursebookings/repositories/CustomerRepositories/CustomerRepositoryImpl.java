package com.codeclan.example.coursebookings.repositories.CustomerRepositories;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findAllCustomersForACourse(Long courseid){
        List<Customer> results = null;
        Session Session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = Session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.id", courseid));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

    public List<Customer> findAllCustomersForTownForCourse(Long courseId, String town){
        List<Customer> results = null;
        Session Session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = Session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("course.id", courseId));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

    public List<Customer> customersForCourseByTownAndAge(Long courseId, String town, int age){
        List<Customer> results = null;
        Session Session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = Session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("course.id", courseId));
            cr.add(Restrictions.gt("age", age));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }



}
