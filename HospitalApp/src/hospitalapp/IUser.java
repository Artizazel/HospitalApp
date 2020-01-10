/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;

/**
 *
 * @author sbloxham2
 */
public interface IUser {
    
    //All relevant fields required by users
    String userID = "";
    public String firstName = "";
    String surname = "";
    String address = "";
    String password = "";
    
    String age = "";
    String gender = "";
    
    public String getUserID();
    public String getFirstName();
    public String getSurname();
    public String getAddress();
    public String getPassword();
    
    public String getAge();
    public String getGender();
    


    
    
}
