/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecretaryPackage;

import hospitalapp.IUser;

/**
 *
 * @author sbloxham2
 */
public class Secretary implements IUser{
    
    private String userID;
    public String firstName;
    private String surname;
    private String address;
    private String password;

    public Secretary(String userID, String firstName, String surname, String address) {
        this.userID = userID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    
    
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    
    
}