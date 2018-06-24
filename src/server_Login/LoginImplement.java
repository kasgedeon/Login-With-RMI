/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Login;

/**
 *
 * @author Daniel
 */

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import rmi_login.LoginInterface;

public class LoginImplement extends UnicastRemoteObject implements LoginInterface {

    public LoginImplement() throws RemoteException {
                
    }
    
    //@Override
    public boolean getLogin(String user, String pass) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        boolean found = false;
        try {
            if(user.equals("admin") && pass.equals("1234")) {
                found = true;
                return found;
            } else {
                found = false;
                return found;
            }
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return found;
    }
}
