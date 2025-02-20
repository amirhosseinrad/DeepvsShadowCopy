package com.example.deepvsshadowcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person implements Cloneable{

    String firstname;
    String lastname;
    Address address;

    Person(Person person) {
        String fname = person.firstname;
        String lname = person.lastname;
        this.address = new Address(person.address); // create a new Address instance
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
