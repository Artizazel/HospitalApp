/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.AdminView.AdminHomepage;
import View.DoctorView.DoctorHomepage;
import View.PatientView.PatientHomepage;
import View.SecretaryView.SecretaryHomepage;
import hospitalapp.SystemDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samue
 */
public class LoginFormTest {
    


    
    public LoginFormTest() {
    }
    
    
    
    @Test
    public void userLoginTest() {
    
        System.out.println("432432");
        
        
    SystemDatabase.RetriveUsers();
    
    String userID = "A0000";
        String password = "a";
        
        
       
        
        for (int i = 0; i < SystemDatabase.users.size(); i++) 
        {
            
            
            System.out.println(SystemDatabase.users.get(i).getUserID());
            System.out.println(userID);
            if(SystemDatabase.users.get(i).getUserID() == null ? userID == null : SystemDatabase.users.get(i).getUserID().equals(userID))
            {
                
                if(SystemDatabase.users.get(i).getPassword() == null ? password == null : SystemDatabase.users.get(i).getPassword().equals(password))
                {
                
                System.out.println("Found");
                
                if(userID.charAt(0) == 'A')
                {
                           
                }
                if(userID.charAt(0) == 'P')
                {
                    
                    fail("wrong user");
                                  
                }
                if(userID.charAt(0) == 'S')
                {
                           
                          fail("wrong user");    
                }
                if(userID.charAt(0) == 'D')
                {
                     
                          fail("wrong user");          
                }
                
                }
                
                
            }
            

            
        }
        
        //lblWrongInput.setText("Wrong Username or Password");
        
}
    
    
    
    
}
