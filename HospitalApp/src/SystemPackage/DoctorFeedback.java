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
    private int rating;
    private String notes;
    private String adminApproved;

    
    
    public DoctorFeedback(String DoctorID, int rating, String notes, String adminApproved) {
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAdminApproved() {
        return adminApproved;
    }

    public void setAdminApproved(String adminApproved) {
        this.adminApproved = adminApproved;
    }
    
    
    
    
}
