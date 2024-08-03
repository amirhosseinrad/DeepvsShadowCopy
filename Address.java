package com.example.deepvsshadowcopy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Setter
@Getter
@AllArgsConstructor
public class Address implements Cloneable{

    String country;
    String city;

    public Address(Address address) {
        this.country = address.country;
        this.city = address.city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("country='" + country + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
