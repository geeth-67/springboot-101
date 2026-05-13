package com.customer.demo.models;

import jakarta.persistence.*;


@Entity
@Table(name = "customer" , uniqueConstraints = {
        @UniqueConstraint(name = "unique_customer_email" , columnNames = "email")
}) // table name and database level rules add

public class Customer {

    /**
     * @Id - every entity should have an primary key
     * @GeneratedValue - tells JPA to auto generate the primary key value
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name" , nullable = false , length = 100)
    private String firstName;

    @Column(name = "last_name" , nullable = false , length = 100)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(name = "phone_number" , nullable = false)
    private String phoneNo;
}
