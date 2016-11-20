/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Controllers;

import ist412.Models.UserList;
import ist412.Models.UserLogin;
import ist412.Views.LoginView;
import java.io.Serializable;

/**
 *
 * @author Richa
 */
public class LoginController {
    private LoginView theLoginUI = null;
    private UserList theUserList = null;
      
    public LoginController(){
        initCustomComponents();
        theLoginUI = new LoginView(this);
        theLoginUI.setTitle("Login");
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true); 
    }
    
    public void initCustomComponents(){
        theUserList = new UserList();
    }
    
    public boolean requestAuthenticate(String theUsername, String thePassword){
        boolean authenticated = false;
        
        //Actually authenticate here >> call userlist & authenticate method
        if(theUserList.authenticate(theUsername, thePassword)){
            System.out.println("Authenticated!");
            theLoginUI.setVisible(false);       
            authenticated = true;
        }    
        return authenticated;
        
    }
}
