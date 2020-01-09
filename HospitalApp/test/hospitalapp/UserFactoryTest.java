/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;

import AdminPackage.Admin;
import DoctorPackage.Doctor;
import PatientPackage.Patient;
import SecretaryPackage.Secretary;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sbloxham2
 */
public class UserFactoryTest{
    public UserFactoryTest() {
    }
    
       /**
     * Test of createUser method, of class UserFactory.
     */
    @Test
public void testCreateDoctor() {

    
 String userID = "D0001";
 
  if(userID.charAt(0) == 'P')
  {
            fail("Wrong user accessed");
        }
        else if(userID.charAt(0) == 'D')
        {
            System.out.println("Doctor Created");
        }
        else if(userID.charAt(0) == 'S')
        {
                 fail("Wrong user accessed");     
            
        }
        else if(userID.charAt(0) == 'A')
        {
           fail("Wrong user accessed");
        }
        
        
        
        
    }
    
 
 
 
 
}
        

