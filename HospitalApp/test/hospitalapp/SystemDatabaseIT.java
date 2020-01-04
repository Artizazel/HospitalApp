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
public class SystemDatabaseIT {
    
    public SystemDatabaseIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of RetriveUsers method, of class SystemDatabase.
     */
    @Test
    public void testRetriveUsers() {
        System.out.println("RetriveUsers");
        SystemDatabase.RetriveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveUsers method, of class SystemDatabase.
     */
    @Test
    public void testSaveUsers() {
        System.out.println("SaveUsers");
        SystemDatabase.SaveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveFeedback method, of class SystemDatabase.
     */
    @Test
    public void testSaveFeedback() {
        System.out.println("SaveFeedback");
        SystemDatabase.SaveFeedback();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveFeedback method, of class SystemDatabase.
     */
    @Test
    public void testRetriveFeedback() {
        System.out.println("RetriveFeedback");
        SystemDatabase.RetriveFeedback();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SavePrescriptions method, of class SystemDatabase.
     */
    @Test
    public void testSavePrescriptions() {
        System.out.println("SavePrescriptions");
        SystemDatabase.SavePrescriptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetrivePrescriptions method, of class SystemDatabase.
     */
    @Test
    public void testRetrivePrescriptions() {
        System.out.println("RetrivePrescriptions");
        SystemDatabase.RetrivePrescriptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveDeletionRequests method, of class SystemDatabase.
     */
    @Test
    public void testSaveDeletionRequests() {
        System.out.println("SaveDeletionRequests");
        SystemDatabase.SaveDeletionRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveDeletionRequests method, of class SystemDatabase.
     */
    @Test
    public void testRetriveDeletionRequests() {
        System.out.println("RetriveDeletionRequests");
        SystemDatabase.RetriveDeletionRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAppointments method, of class SystemDatabase.
     */
    @Test
    public void testSaveAppointments() {
        System.out.println("SaveAppointments");
        SystemDatabase.SaveAppointments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveAppointments method, of class SystemDatabase.
     */
    @Test
    public void testRetriveAppointments() {
        System.out.println("RetriveAppointments");
        SystemDatabase.RetriveAppointments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAccountRequests method, of class SystemDatabase.
     */
    @Test
    public void testSaveAccountRequests() {
        System.out.println("SaveAccountRequests");
        SystemDatabase.SaveAccountRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveAccountRequests method, of class SystemDatabase.
     */
    @Test
    public void testRetriveAccountRequests() {
        System.out.println("RetriveAccountRequests");
        SystemDatabase.RetriveAccountRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveMedicines method, of class SystemDatabase.
     */
    @Test
    public void testSaveMedicines() {
        System.out.println("SaveMedicines");
        SystemDatabase.SaveMedicines();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveMedicines method, of class SystemDatabase.
     */
    @Test
    public void testRetriveMedicines() {
        System.out.println("RetriveMedicines");
        SystemDatabase.RetriveMedicines();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetriveDatabase method, of class SystemDatabase.
     */
    @Test
    public void testRetriveDatabase() {
        System.out.println("RetriveDatabase");
        SystemDatabase.RetriveDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveDatabase method, of class SystemDatabase.
     */
    @Test
    public void testSaveDatabase() {
        System.out.println("SaveDatabase");
        SystemDatabase.SaveDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveUser method, of class SystemDatabase.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("RemoveUser");
        String userID = "";
        SystemDatabase.RemoveUser(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findSecretary method, of class SystemDatabase.
     */
    @Test
    public void testFindSecretary() {
        System.out.println("findSecretary");
        IUser expResult = null;
        IUser result = SystemDatabase.findSecretary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFeedback method, of class SystemDatabase.
     */
    @Test
    public void testFindFeedback() {
        System.out.println("findFeedback");
        String notes = "";
        DoctorFeedback expResult = null;
        DoctorFeedback result = SystemDatabase.findFeedback(notes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUser method, of class SystemDatabase.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        String userID = "";
        IUser expResult = null;
        IUser result = SystemDatabase.findUser(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMed method, of class SystemDatabase.
     */
    @Test
    public void testFindMed() {
        System.out.println("findMed");
        String medName = "";
        Medicine expResult = null;
        Medicine result = SystemDatabase.findMed(medName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentUserID method, of class SystemDatabase.
     */
    @Test
    public void testGetCurrentUserID() {
        System.out.println("getCurrentUserID");
        String expResult = "";
        String result = SystemDatabase.getCurrentUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentUserID method, of class SystemDatabase.
     */
    @Test
    public void testSetCurrentUserID() {
        System.out.println("setCurrentUserID");
        String currentUserID = "";
        SystemDatabase.setCurrentUserID(currentUserID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
