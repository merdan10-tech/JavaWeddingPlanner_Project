
package Week5.ProgrammingProject3;

import java.time.LocalDate;

public class Person {
    // Declare (three) variables
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    // Constructor
    public Person(String firstName, String lastName, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    
}
 