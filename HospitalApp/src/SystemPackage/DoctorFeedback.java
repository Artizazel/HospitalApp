/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemPackage;

/**
 *
 * @author sbloxham2
 */
public class DoctorFeedback {
    
    //All relevant fields required for its object
    private String DoctorID;
    private String rating;
    private String notes;
    private String Status;
   

    
    //DoctorFeedback constructor, fills the DoctorFeedback object with the releavant fields

    public DoctorFeedback(String DoctorID, String rating, String notes, String Status) {
        this.DoctorID = DoctorID;
        this.rating = rating;
        this.notes = notes;
        this.Status = Status;
    }

    

    
    
    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
    
}
