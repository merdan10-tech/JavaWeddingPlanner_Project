/*
 * Problem Statement: Create a class named Person that holds the following fields: two 
 * String objects for the person’s first and last name and a LocalDate object for the person’s 
 * birthdate. Create a class named Couple that contains two Person objects. Create a class 
 * named Wedding for a wedding planner that includes the date of the wedding, the names of 
 * the Couple being married, and a String for the location. Provide constructors for each 
 * class that accept parameters for each field, and provide get methods for each field. Then 
 * write a program that creates two Wedding objects and in turn passes each to a method that 
 * displays all the details. Save the files as Person.java, Couple.java, Wedding.java, and 
 * TestWedding.java. 
 * 
 * Author: Merdan Garlyyev
 * Date: Sept 15, 2023
 */

package Week5.ProgrammingProject3;

import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args ) {
        // Create two person objects for creating the first couple 
        Person person1 = new Person("Timothy", "Moore", LocalDate.of(1962, 1, 27));
        
        Person person2 = new Person("Rachel", "Smith", LocalDate.of(1966, 8, 19));

        // Create a couple object
        Couple couple1 = new Couple(person1, person2);
        
        // Create a wedding object
        Wedding wedding1 = new Wedding(LocalDate.of(2023, 12, 15), couple1, "Argentina");
        
        // Display the details of the first wedding
        displayDetails(wedding1);

        // Create two more person objects
        Person person3 = new Person("Bill", "Stevenson", LocalDate.of(1989, 6, 21));
        Person person4 = new Person("Martina", "Peterson", LocalDate.of(1991, 4, 23));

        
        // Create couple2 
        Couple couple2 = new Couple(person3, person4);

        // Create wedding2
        Wedding wedding2 = new Wedding(LocalDate.of(2023, 10, 15), couple2, "Atlanta");

        // Display details of the second wedding 
        displayDetails(wedding2);
    }
    public static void displayDetails(Wedding wedding) {
        System.out.println("Wedding Details:");
        System.out.println("Date: " + wedding.getWeddingDate());

        Couple couple = wedding.getCouple();

        Person person1 = couple.getPerson1();
        Person person2 = couple.getPerson2();

        System.out.println("Couple: ");
        System.out.println("  - " + person1.getFirstName() + " " + person1.getLastName() + " (Born: " + person1.getBirthDate() + ")");
        System.out.println("  - " + person2.getFirstName() + " " + person2.getLastName() + " (Born: " + person2.getBirthDate() + ")");
        System.out.println("Location: " + wedding.getLocation());
        System.out.println();

    }
}
