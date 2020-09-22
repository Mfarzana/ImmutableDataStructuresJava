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
/*
1. make your class final, so that no other class can extend it
2. make all instance variables private and final so that they ae initialized only once insdie the constructor and never modified afterward 
3. provide only getter methods donot provide setter method 
4. if the class holds a mutable object . make sure to alywas return a clone copy of the field and never return the real object instance
*/
public class ImmutableClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> skills=new LinkedHashSet<>();
        skills.add("Java");
        skills.add("Python");
        Address addr=new Address("Japan","Tokyo");
        Employee employee=new Employee(1, "David", "david@gmil.com", skills, addr);
        
        System.out.println(" Employee  : "+employee);
        System.out.println(" ........................Try to change state of  Employee new.........................");

        employee.getAddress().setCountry("England");
        skills=new LinkedHashSet<>();
        skills.add("Spring Boot");
        skills.add("Laraval");
        System.out.println(" Employee after changig state:"+employee);

    }
    
}
