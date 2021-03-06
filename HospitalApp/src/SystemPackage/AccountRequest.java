/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemPackage;

import hospitalapp.SystemDatabase;

/**
 *
 * @author sbloxham2
 */
public class AccountRequest {
    
    //All relevant fields required for its object
    private String firstName;
    private String surname;
    private String address;
    private String age;
    private String gender;
    private String password;

    
    
    //AccountRequest constructor, fills the AccountRequest object with the releavant fields
    public AccountRequest(String firstName, String surname, String address, String password, String gender, String age) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.password = password;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
    
}
