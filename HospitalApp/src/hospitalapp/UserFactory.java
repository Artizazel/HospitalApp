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

/**
 *
 * @author sbloxham2
 */
public class UserFactory {
    
    public static void createUser(String userID, String firstName, String surname, String address, String password, String gender, String age)
    {
        if(userID.charAt(0) == 'P')
        {
            Patient patient = new Patient(userID, firstName, surname, address, password, gender, age);
            
            SystemDatabase.users.add(patient);
        }
        else if(userID.charAt(0) == 'D')
        {
            Doctor doctor = new Doctor(userID, firstName, surname, address, password);
            
            SystemDatabase.users.add(doctor);
        }
        else if(userID.charAt(0) == 'S')
        {
            Secretary secretary = new Secretary(userID, firstName, surname, address, password);
            
            SystemDatabase.users.add(secretary);            
            
        }
        else if(userID.charAt(0) == 'A')
        {
            Admin admin = new Admin(userID, firstName, surname, address, password);
            
            SystemDatabase.users.add(admin);
        }
        
        
        SystemDatabase.SaveDatabase();
        
    }
    
    
    
}
