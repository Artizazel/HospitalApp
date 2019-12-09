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
public class Appointment {
    
    private String docId;
    private String patientID;
    private String dates;
    private String status;

    
    public Appointment(String docId, String patientID, String dates, String status) {
        this.docId = docId;
        this.patientID = patientID;
        this.dates = dates;
        this.status = status;
    }

    
    
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
    
    
    
    
    
    
}
