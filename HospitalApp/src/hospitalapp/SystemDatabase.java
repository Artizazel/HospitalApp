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
    
     
    
    
    public static void RetriveUsers()
    {
        
        
        
        
         JSONParser JParser = new JSONParser();         
         try {
             
             JSONArray JSONUsers = (JSONArray) JParser.parse(new FileReader("src/Database/Users.txt"));
             
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
            
            
            FileWriter file = new FileWriter(new File("src/Database/Users.txt").getAbsolutePath());
            
            

            file.write(JSONUsers.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
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
             
             accountFields.put("rID", accountRequests.get(i).getRecieverID());
                 
             
             
             
             JSONAccounts.add(i, accountFields);
             
         }
         
         
        
            
            try {
            
            
            FileWriter file = new FileWriter(new File("src/Database/AccountRequests.txt").getAbsolutePath());
            
            

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
             
             JSONArray JSONAccountRequests = (JSONArray) JParser.parse(new FileReader("src/Database/AccountRequests.txt"));
             
             if(JSONAccountRequests != null)
             {
                 for (int i = 0; i < JSONAccountRequests.size(); i++) {
                     
                     JSONObject AccountFields = (JSONObject) JSONAccountRequests.get(i);
                     
                     
                     String rID = (String) AccountFields.get("rID");
                     String firstname = (String) AccountFields.get("firstname");
                     String surname = (String) AccountFields.get("surname");
                     String address = (String) AccountFields.get("address");
                     String password = (String) AccountFields.get("password");
                     String age = (String) AccountFields.get("age");
                     String gender = (String) AccountFields.get("gender");
                         
                
                     
                     
                    AccountRequest accountRequest = new AccountRequest(rID, firstname, surname, address, password, gender, age);
                     
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
         
         
         
         
         
     }
    
    
    
    
     public static void SaveDatabase()
     {
              
         SaveUsers();
         SaveAccountRequests();
         
     }

    public SystemDatabase() {
        
        
        
    }
     
    
     public void RemoveUser(String userID)
     {   
         
         users.remove(findUser(userID));
         
         SaveDatabase();
         
         //this.getClass().getResource("filenamne.json");
         
         
     }
    
     public IUser findSecretary()
     {
         
         for (int i = 0; i < users.size(); i++) {
             if(users.get(i).getUserID().charAt(0) == 'S')
             {
                 return users.get(i);                 
             }
         }
         
         return null;
         
     }
     
     public IUser findUser(String userID)
     {
         
         for (int i = 0; i < users.size(); i++) {
             if(users.get(i).getUserID().equals(userID))
             {
                 return users.get(i);                 
             }
         }
         
         return null;
     }
     
     
     
     
     
     
     
     
    
    
}
