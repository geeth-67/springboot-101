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

    @Column(name = "phone_number" , nullable = true , length = 14)
    private String phoneNo;


    public Customer() {}

    public Customer(String firstName , String lastName , String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
