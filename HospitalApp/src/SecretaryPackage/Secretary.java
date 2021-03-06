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
    
     //All relevant fields as defined by the IUser interface
    private String userID;
    public String firstName;
    private String surname;
    private String address;
    private String password;
    private String age;
    private String gender;

    
    
    //Secretary constructor, fills the secretary object with the releavant fields
    public Secretary(String userID, String firstName, String surname, String address, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.password = password;
    }
    
    @Override
    public String getAge() {
        return null;
    }

    public void setAge(String age) {
        this.age = age;
    }
@Override
    public String getGender() {
        return null;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
@Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
@Override
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
@Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    
    
}
