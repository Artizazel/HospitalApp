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
    private Medicine medicine;
    private int quality;
    private String dosage;
    private boolean recieved;

    public Prescription(String docID, String patientID, String doctorNotes, Medicine medicine, int quality, String dosage, boolean recieved) {
        this.docID = docID;
        this.patientID = patientID;
        this.doctorNotes = doctorNotes;
        this.medicine = medicine;
        this.quality = quality;
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

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
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
