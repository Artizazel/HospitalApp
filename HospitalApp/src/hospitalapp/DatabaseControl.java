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
public interface DatabaseControl {
    
    public abstract void RemoveUser(String userID);
    
    public abstract IUser findUser(String userID);
    
    public abstract IUser findSecretary();
    
    
    
    
    
    
}
