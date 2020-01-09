/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import hospitalapp.SystemDatabase;
import hospitalapp.UserFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sbloxham2
 */
public class CreateAccountTest {
    
    public CreateAccountTest() {
    }
    
    
    /**
     * Test of main method, of class CreateAccount.
     */
     @Test
    public void testCreateNewUser () {
       
        
        
        String firstname = "Dave";
        String surname = "Johnson";
        String address = "123 Lane";
        String password = "dog43";
        String gender = "Male";
        String age = "32";
        
        
         
            UserFactory.createUser("A0000", firstname, surname, address, password, gender, age);            
        
        
        
        if(SystemDatabase.users.size() == 0)
        {
            
           
            fail("Admin wasn't added to the database");
       
        
        }
        else
        {
            
            System.out.println("Admin was successfully added");
            
            
        }
    }
    
}
