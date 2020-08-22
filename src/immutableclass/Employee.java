/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutableclass;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Farzana
 */
//1. Make your class final, so taht no other class can extend it
final public class Employee {
    /* 2. make all instance variables private and final
    so that they ae initialized only once insdie the constructor and never modified afterward 
  */
    private final int id;
    private final String name;
    private final String email;
    private final Set<String> skills;
    private final Address address;

    public Employee(int id, String name, String email, Set<String> skills, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.address = address;
    }
// 3. provide only getter methods donot provide setter method 
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /* mutable object 
     4. if the class holds a mutable object .
        make sure to always return a clone copy of the field
        and never return the real object instance

    */
    public Set<String> getSkills() {
        return new LinkedHashSet<>(skills);//return a clone copy of the field
    }

    public Address getAddress() {
        // return a clone copy of the field
        Address empAddr=new Address();
        empAddr.setCity(address.getCountry());
        empAddr.setCity(address.getCity());
        return empAddr;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", skills=" + skills + ", address=" + address + '}';
    }
    
   
    
    
}
