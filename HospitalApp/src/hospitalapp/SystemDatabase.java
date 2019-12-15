/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;
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
    
    
    static File usersFile = new File("src/Database/Users.txt");
    static File accountRequestsFile = new File("src/Database/AccountRequests.txt");
    static File doctorFeedbackFile = new File("src/Database/DoctorFeedback.txt");
     static File appointmentsFile = new File("src/Database/Appointments.txt");
    static File prescriptionsFile = new File("src/Database/Prescriptions.txt");
    static File mediciesFile = new File("src/Database/Medicines.txt");
    
     
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
             feedbackFields.put("adminApproved", doctorFeedback.get(i).getAdminApproved());
             
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
                     
                     System.out.println("Feedback retrived");
                     
                     JSONObject feedbackFields = (JSONObject) JSONFeedback.get(i);
                     
                     
                     String DoctorID = (String) feedbackFields.get("docID");
                     String rating = (String) feedbackFields.get("rating");
                     String notes = (String) feedbackFields.get("notes");
                     boolean adminApproved = (boolean) feedbackFields.get("adminApproved");
                     
                         
                
                     
                     
                    DoctorFeedback doctorFeedbackObj = new DoctorFeedback(DoctorID, rating, notes, adminApproved);
                     
                    doctorFeedback.add(doctorFeedbackObj);
                    
                    
                    
                     
                     
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
    
    
    
    
     
    public static void RetriveDatabase()
     {        
         
         RetriveUsers();
         
         RetriveAccountRequests();
         
         RetriveFeedback();
         
         
     }
    
    
    
    
     public static void SaveDatabase()
     {
              
         SaveUsers();
         
         SaveAccountRequests();
         
         SaveFeedback();
         
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
