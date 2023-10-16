
package Week5.ProgrammingProject3;

import java.time.LocalDate;

public class Wedding {
    // Declare (three) variable
    private LocalDate weddingDate;
    private Couple couple;
    private String location;

    // Constructor
    public Wedding(LocalDate weddingDate, Couple couple, String location){
        this.weddingDate = weddingDate;
        this.couple = couple;
        this.location = location;
    }
    // Getters
    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public Couple getCouple(){
        return couple;
    }
    public String getLocation(){
        return location;
    }
    
}
