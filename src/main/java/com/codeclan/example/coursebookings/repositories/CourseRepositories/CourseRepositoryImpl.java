package com.codeclan.example.coursebookings.repositories.CourseRepositories;


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


public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Course> findAllCoursesByRating(int rating){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("rating", rating));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

    @Transactional
    public List<Course> findAllCoursesForCustomer(Long customerId){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.customer", "customer");
            cr.add(Restrictions.eq("customer.id", customerId));
            results = cr.list();
            }catch(HibernateException ex){
                ex.printStackTrace();
            }
            return results;

    }
}
