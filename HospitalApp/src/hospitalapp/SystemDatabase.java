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
    
    
    static JSONObject savedDatabase = new JSONObject();
    
     
     
    public static void RetriveDatabase()
     {        
         
         //JSONParser parser = new JOSNParser();
         
         try {
            
            
            
         Object file = new FileReader(new File("src/Database/Database.txt").getAbsolutePath());
            
         savedDatabase = (JSONObject)file;
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         users = (ArrayList<IUser>)savedDatabase.get("userDatabase");
         
         
         
     }
    
    
    
    
     public static void SaveDatabase()
     {
               
         
         savedDatabase.put("userDatabase", users);
         
        /*
        try {
            
            //FileWriter file = new FileWriter(this.getClass().getResource("Database.txt"));
            
            
            FileWriter file = new FileWriter(this.getClass().getResource("Database/Database2.txt").toString()());

            //file.write(savedDatabase.toJSONString());
            
            file.write("yay");
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
            
            try {
            
            //FileWriter file = new FileWriter(this.getClass().getResource("Database.txt"));
            
            FileWriter file = new FileWriter(new File("src/Database/Database.txt").getAbsolutePath());
            
            

            file.write(savedDatabase.toJSONString());
            
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(SystemDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
         
     }

    public SystemDatabase() {
        
        
        
    }
     
    
     public void RemoveUser(String userID)
     {   
         
         users.remove(findUser(userID));
         
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
