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
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
         
         users = (ArrayList<IUser>)savedDatabase.get("userDatabase");
         
         
         
     }
    
     public static void SaveDatabase()
     {
               
         
         savedDatabase.put("userDatabase", users);
         
     }
     
    
     public void RemoveUser(String userID)
     {   
         
         users.remove(findUser(userID));
         
         
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
