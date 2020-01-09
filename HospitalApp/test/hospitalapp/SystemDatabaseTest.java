/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;

import SystemPackage.DoctorFeedback;
import SystemPackage.Medicine;
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
public class SystemDatabaseTest {
    
    public SystemDatabaseTest() {
    }
    
    
    @Test
    public void testRetriveUsers() {
        System.out.println("RetriveUsers");
        SystemDatabase.RetriveUsers();
        
        if(SystemDatabase.users.size() > 0)
        {
            System.out.println("Database has users in it");
        }
        else
        {
            fail("user arraylist is empty");
        }
    
        
    }
    
    
}
