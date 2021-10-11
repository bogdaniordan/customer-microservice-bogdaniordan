package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private String occupation;

    private String username;

    private String password;

    public Customer(String firstName, String lastName, int age, String occupation, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.username = username;
        this.password = password;
    }
}
