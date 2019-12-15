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
    
    private String DoctorID;
    private String rating;
    private String notes;
    private boolean adminApproved;
   

    
    
    public DoctorFeedback(String DoctorID, String rating, String notes, boolean adminApproved) {
        this.DoctorID = DoctorID;
        this.rating = rating;
        this.notes = notes;
        this.adminApproved = adminApproved;
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

    public boolean getAdminApproved() {
        return adminApproved;
    }

    public void setAdminApproved(boolean adminApproved) {
        this.adminApproved = adminApproved;
    }
    
    
    
    
}
