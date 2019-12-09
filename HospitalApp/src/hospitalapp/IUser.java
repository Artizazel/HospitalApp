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
    
    String userID = "";
    public String firstName = "";
    String surname = "";
    String address = "";
    String password = "";
    
    public String getUserID();
    public String getFirstName();
    public String getSurname();
    public String getAddress();


    
    
}
