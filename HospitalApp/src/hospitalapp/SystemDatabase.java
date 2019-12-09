/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;
import java.util.ArrayList;
/**
 *
 * @author sbloxham2
 */
public class SystemDatabase implements DatabaseControl{
    
    public static ArrayList<IUser> users = new ArrayList<>();
    
    
    
    
    
     public void RemoveUser(String userID)
     {   
     }
    
     
     public IUser findUser(String userID)
     {
         IUser desiredUser = null;
         
         
         
         return desiredUser;
     }
     
     public IUser findSecretary()
     {
         IUser desiredSecretary = null;
         
         return desiredSecretary;
     }
     
     
     
     
     
     
    
    
}
