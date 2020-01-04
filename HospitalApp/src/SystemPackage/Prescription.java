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
public class Prescription {
    
    private String docID;
    private String patientID;
    private String doctorNotes;
    private String medName;
    private Long quantity;
    private String dosage;
    private boolean recieved;

    public Prescription(String docID, String patientID, String doctorNotes, String medName, Long quantity, String dosage, boolean recieved) {
        this.docID = docID;
        this.patientID = patientID;
        this.doctorNotes = doctorNotes;
        this.medName = medName;
        this.quantity = quantity;
        this.dosage = dosage;
        this.recieved = recieved;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    
    
    
    public boolean getRecieved() {
        return recieved;
    }

    public void setRecieved(boolean recieved) {
        this.recieved = recieved;
    }

    
    
    
    
}
