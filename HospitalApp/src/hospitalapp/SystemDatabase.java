/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;
import PatientPackage.Patient;
import SystemPackage.AccountRequest;
import SystemPackage.Appointment;
import SystemPackage.DoctorFeedback;
import SystemPackage.Medicine;
import SystemPackage.Prescription;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author sbloxham2
 */
public class SystemDatabase implements DatabaseControl{
    
    public static ArrayList<IUser> users = new ArrayList<>();
    
    public static ArrayList<AccountRequest> accountRequests = new ArrayList<>();
    public static ArrayList<Appointment> appointments = new ArrayList<>();
    public static ArrayList<DoctorFeedback> doctorFeedback = new ArrayList<>();
    public static ArrayList<Medicine> medicines = new ArrayList<>();
    public static ArrayList<Prescription> prescriptions = new ArrayList<>();
    public static ArrayList<IUser> deletionRequests = new ArrayList<>();
    
    
    static File usersFile = new File("src/Database/Users.txt");
    static File accountRequestsFile = new File("src/Database/AccountRequests.txt");
    static File doctorFeedbackFile = new File("src/Database/DoctorFeedback.txt");
     static File appointmentsFile = new File("src/Database/Appointments.txt");
    static File prescriptionsFile = new File("src/Database/Prescriptions.txt");
    static File medicinesFile = new File("src/Database/Medicines.txt");
    static File deletionRequestsFile = new File ("src/Database/DeletionRequests.txt");
    
     
    private static String currentUserID;
    
    public static void RetriveUsers()
    {
        
        
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONUsers = (JSONArray) JParser.parse(new FileReader(usersFile.getAbsolutePath()));
             
             if(JSONUsers != null)
             {
                 for (int i = 0; i < JSONUsers.size(); i++) {
                     
                     JSONObject UserField = (JSONObject) JSONUsers.get(i);
                     
                     
                     String ID = (String) UserField.get("ID");
                     String firstname = (String) UserField.get("firstname");
                     String surname = (String) UserField.get("surname");
                     String address = (String) UserField.get("address");
                     String password = (String) UserField.get("password");
                     String age = "";
                     String gender = "";
                     
                     if(ID.charAt(0) == 'P')
                     {
                         
                         age = (String) UserField.get("age");
                         
                         gender = (String) UserField.get("gender");
                         
                     }
                     
                     
                     UserFactory.createUser(ID, firstname, surname, address, password, gender, age);
                     
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
        
    }
    
    
    public static void SaveUsers()
    {
        
         
         JSONArray JSONUsers = new JSONArray();
         
         
         
         for (int i = 0; i < users.size(); i++) {
             
             JSONObject userField = new JSONObject();
             
             userField.put("ID", users.get(i).getUserID());
             userField.put("firstname", users.get(i).getFirstName());
             userField.put("surname", users.get(i).getSurname());
             userField.put("address", users.get(i).getAddress());
             userField.put("password", users.get(i).getPassword());
             
             if(users.get(i).getUserID().charAt(0) == 'P')
             {
                 
                 userField.put("age", users.get(i).getAge());
                 userField.put("gender", users.get(i).getGender());
                 
             }
             
             
             JSONUsers.add(i, userField);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(usersFile.getAbsolutePath());
            
            

            file.write(JSONUsers.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
        
    }
    
    
    
    public static void SaveFeedback()
    {
        
        JSONArray JSONFeedback = new JSONArray();
         
         
         
         for (int i = 0; i < doctorFeedback.size(); i++) {
             
             JSONObject feedbackFields = new JSONObject();
             
             
             feedbackFields.put("docID", doctorFeedback.get(i).getDoctorID());
             feedbackFields.put("rating", doctorFeedback.get(i).getRating());
             feedbackFields.put("notes", doctorFeedback.get(i).getNotes());
             feedbackFields.put("status", doctorFeedback.get(i).getStatus());
             
             JSONFeedback.add(i, feedbackFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(doctorFeedbackFile.getAbsolutePath());
            
            

            file.write(JSONFeedback.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
      
    public static void RetriveFeedback()
    {
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONFeedback = (JSONArray) JParser.parse(new FileReader(doctorFeedbackFile.getAbsolutePath()));
             
             
             
             if(JSONFeedback != null)
             {
                 
                 
                 for (int i = 0; i < JSONFeedback.size(); i++) {
                     
                     
                     JSONObject feedbackFields = (JSONObject) JSONFeedback.get(i);
                     
                     
                     String DoctorID = (String) feedbackFields.get("docID");
                     String rating = (String) feedbackFields.get("rating");
                     String notes = (String) feedbackFields.get("notes");
                     String status = (String) feedbackFields.get("status");
                
                     
                     
                    DoctorFeedback doctorFeedbackObj = new DoctorFeedback(DoctorID, rating, notes, status);
                     
                    doctorFeedback.add(doctorFeedbackObj);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    
    public static void SavePrescriptions()
    {
        
        JSONArray JSONPres = new JSONArray();
         
         
         
         for (int i = 0; i < doctorFeedback.size(); i++) {
             
             JSONObject presFields = new JSONObject();
             
             
             presFields.put("docID", prescriptions.get(i).getDocID());
             presFields.put("patientID", prescriptions.get(i).getPatientID());
             presFields.put("doctorNotes", prescriptions.get(i).getDoctorNotes());
             presFields.put("medName", prescriptions.get(i).getMedName());
             presFields.put("quantity", prescriptions.get(i).getQuantity());
             presFields.put("dosage", prescriptions.get(i).getDosage());
             presFields.put("recieved", prescriptions.get(i).getRecieved());
             
             
             
             
             JSONPres.add(i, presFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(prescriptionsFile.getAbsolutePath());
            
            

            file.write(JSONPres.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
      
    public static void RetrivePrescriptions()
    {
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONPres = (JSONArray) JParser.parse(new FileReader(prescriptionsFile.getAbsolutePath()));
             
             
             
             if(JSONPres != null)
             {
                 
                 
                 for (int i = 0; i < JSONPres.size(); i++) {
                     
                   
                     
                     JSONObject presFields = (JSONObject) JSONPres.get(i);
                     
                     
                     String docID = (String) presFields.get("docID");
                     String patientID = (String) presFields.get("patientID");
                     String doctorNotes = (String) presFields.get("doctorNotes");
                     String medName = (String) presFields.get("medName");
                     int quantity = (int) presFields.get("quantity");
                     String dosage = (String) presFields.get("dosage");
                     boolean recieved = (boolean) presFields.get("recieved");
                     
                         
                
                     
                     
                    Prescription preObj = new Prescription(docID, patientID, doctorNotes, medName, quantity, dosage, recieved);
                     
                    prescriptions.add(preObj);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    
     
    public static void SaveDeletionRequests()
    {
        
        JSONArray JSONDeletionRequests = new JSONArray();
         
         
         
         for (int i = 0; i < deletionRequests.size(); i++) {
             
             JSONObject deletionFields = new JSONObject();
             
             
             deletionFields.put("ID", deletionRequests.get(i).getUserID());
             deletionFields.put("firstname", deletionRequests.get(i).getFirstName());
             deletionFields.put("surname", deletionRequests.get(i).getSurname());
             deletionFields.put("address", deletionRequests.get(i).getAddress());
             deletionFields.put("password", deletionRequests.get(i).getPassword());
             deletionFields.put("age", deletionRequests.get(i).getAge());
             deletionFields.put("gender", deletionRequests.get(i).getGender());
                 
             
             
             
             JSONDeletionRequests.add(i, deletionFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(deletionRequestsFile.getAbsolutePath());
            
            

            file.write(JSONDeletionRequests.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
      
    public static void RetriveDeletionRequests()
    {
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONDeletionRequests = (JSONArray) JParser.parse(new FileReader(deletionRequestsFile.getAbsolutePath()));
             
             
             
             if(JSONDeletionRequests != null)
             {
                 
                 
                 for (int i = 0; i < JSONDeletionRequests.size(); i++) {
                     
                     
                     JSONObject deletionFields = (JSONObject) JSONDeletionRequests.get(i);
                     
                     
                     String ID = (String) deletionFields.get("ID");
                     String firstname = (String) deletionFields.get("firstname");
                     String surname = (String) deletionFields.get("surname");
                     String address = (String) deletionFields.get("address");
                     String password = (String) deletionFields.get("password");
                     String age = (String) deletionFields.get("age");
                     String gender = (String) deletionFields.get("gender");
                         
                    
                
                     
                     
                    Patient deletionRequestObj = new Patient(ID, firstname, surname, address, password, gender, age);
                     
                    deletionRequests.add(deletionRequestObj);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    
     public static void SaveAppointments()
    {
        
        JSONArray JSONAppointments = new JSONArray();
         
         
         
         for (int i = 0; i < appointments.size(); i++) {
             
             JSONObject appointmentFields = new JSONObject();
             
             
             appointmentFields.put("docID", appointments.get(i).getDocId());
             appointmentFields.put("patientID", appointments.get(i).getPatientID());
             appointmentFields.put("dates", appointments.get(i).getDates());
             appointmentFields.put("status", appointments.get(i).getStatus());
             
             
             
             JSONAppointments.add(i, appointmentFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(appointmentsFile.getAbsolutePath());
            
            

            file.write(JSONAppointments.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
      
    public static void RetriveAppointments()
    {
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONAppointments = (JSONArray) JParser.parse(new FileReader(appointmentsFile.getAbsolutePath()));
             
             
             
             if(JSONAppointments != null)
             {
                 
                 
                 for (int i = 0; i < JSONAppointments.size(); i++) {
                     
                     
                     JSONObject appointmentFields = (JSONObject) JSONAppointments.get(i);
                     
                     
                     String docID = (String) appointmentFields.get("docID");
                     String patientID = (String) appointmentFields.get("patientID");
                     String dates = (String) appointmentFields.get("dates");
                     String status = (String) appointmentFields.get("status");
                    
                         
                    
                
                     
                     
                    Appointment appointmentFieldsObj = new Appointment(docID, patientID, dates, status);
                     
                    appointments.add(appointmentFieldsObj);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    public static void SaveAccountRequests()
    {
        
        JSONArray JSONAccounts = new JSONArray();
         
         
         
         for (int i = 0; i < accountRequests.size(); i++) {
             
             JSONObject accountFields = new JSONObject();
             
             
             accountFields.put("firstname", accountRequests.get(i).getFirstName());
             accountFields.put("surname", accountRequests.get(i).getSurname());
             accountFields.put("address", accountRequests.get(i).getAddress());
             accountFields.put("password", accountRequests.get(i).getPassword());
             
             accountFields.put("age", accountRequests.get(i).getAge());
             accountFields.put("gender", accountRequests.get(i).getGender());
             
                 
             
             
             
             JSONAccounts.add(i, accountFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(new File(accountRequestsFile.getAbsolutePath()));
            
            

            file.write(JSONAccounts.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public static void RetriveAccountRequests()
    {
        
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONAccountRequests = (JSONArray) JParser.parse(new FileReader(accountRequestsFile.getAbsolutePath()));
             
             if(JSONAccountRequests != null)
             {
                 for (int i = 0; i < JSONAccountRequests.size(); i++) {
                     
                     JSONObject AccountFields = (JSONObject) JSONAccountRequests.get(i);
                     
                     
                     String firstname = (String) AccountFields.get("firstname");
                     String surname = (String) AccountFields.get("surname");
                     String address = (String) AccountFields.get("address");
                     String password = (String) AccountFields.get("password");
                     String age = (String) AccountFields.get("age");
                     String gender = (String) AccountFields.get("gender");
                         
                
                     
                     
                    AccountRequest accountRequest = new AccountRequest(firstname, surname, address, password, gender, age);
                     
                    accountRequests.add(accountRequest);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    
    
    
    
    public static void SaveMedicines()
    {
        
        JSONArray JSONMeds = new JSONArray();
         
         
         
         for (int i = 0; i < medicines.size(); i++) {
             
             JSONObject medFields = new JSONObject();
             
             
             medFields.put("name", medicines.get(i).getName());
             medFields.put("stock", medicines.get(i).getStock());
             
             
             JSONMeds.add(i, medicines);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(new File(medicinesFile.getAbsolutePath()));
            
            

            file.write(JSONMeds.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public static void RetriveMedicines()
    {
        
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONMeds = (JSONArray) JParser.parse(new FileReader(medicinesFile.getAbsolutePath()));
             
             if(JSONMeds != null)
             {
                 for (int i = 0; i < JSONMeds.size(); i++) {
                     
                     JSONObject medFields = (JSONObject) JSONMeds.get(i);
                     
                     
                     String name = (String) medFields.get("name");
                     int stock = (int) medFields.get("stock");
                   
                         
                
                     
                     
                    Medicine meds = new Medicine(name, stock);
                     
                    medicines.add(meds);
                    
                    
                    
                     
                     
                 }
                 
                 
             }
             
             
             
             
            
        } catch (Exception ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
        
    }
    
    
    
    
    
     
    public static void RetriveDatabase()
     {        
         
         RetriveUsers();
         
         RetriveAccountRequests();
         
         RetriveFeedback();
         
         RetriveDeletionRequests();
         
         RetriveAppointments();
         
         RetriveMedicines();
         
         RetrivePrescriptions();
         
     }
    
    
    
    
     public static void SaveDatabase()
     {
              
         SaveUsers();
         
         SaveAccountRequests();
         
         SaveFeedback();
         
         SaveDeletionRequests();
         
         SaveAppointments();
         
         SaveMedicines();
         
         SavePrescriptions();
         
     }

    public SystemDatabase() {
        
        
        
    }
     
    
     public static void RemoveUser(String userID)
     {   
         
        
         
         
         users.remove(findUser(userID));
         
         
         
         SaveDatabase();
         
         //this.getClass().getResource("filenamne.json");
         
         
     }
     
     
     
    
     public static IUser findSecretary()
     {
         
         for (int i = 0; i < users.size(); i++) {
             if(users.get(i).getUserID().charAt(0) == 'S')
             {
                 return users.get(i);                 
             }
         }
         
         return null;
         
     }
     
     public static DoctorFeedback findFeedback(String notes)
     {
         
         for (int i = 0; i < doctorFeedback.size(); i++) {
             if(doctorFeedback.get(i).getNotes().equals(notes))
             {
                 return doctorFeedback.get(i);                 
             }
         }
         
         return null;
     }
     
     public static IUser findUser(String userID)
     {
         
         for (int i = 0; i < users.size(); i++) {
             if(users.get(i).getUserID().equals(userID))
             {
                 return users.get(i);                 
             }
         }
         
         return null;
     }

    public static String getCurrentUserID() {
        return currentUserID;
    }

    public static void setCurrentUserID(String currentUserID) {
        SystemDatabase.currentUserID = currentUserID;
    }
     
     
     
     
     
     
     
     
    
    
}
