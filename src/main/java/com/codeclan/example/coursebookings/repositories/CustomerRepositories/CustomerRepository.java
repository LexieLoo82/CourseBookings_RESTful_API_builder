package com.codeclan.example.coursebookings.repositories.CustomerRepositories;


import com.codeclan.example.coursebookings.models.Customer;
import com.codeclan.example.coursebookings.projections.EmbedForCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
