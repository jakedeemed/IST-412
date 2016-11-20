/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Jorge
 */
public class UserList implements Serializable{
    
    private ArrayList<UserLogin> theUserList;
    
    public UserList(){
        theUserList = new ArrayList();
        UserLogin u1 = new UserLogin("test", "password");
        UserLogin u2 = new UserLogin("test1", "password1");
        theUserList.add(u1);
        theUserList.add(u2);
    }

    /**
     * @return the theUserList
     */
    public ArrayList<UserLogin> getTheUserList() {
        return theUserList;
    }

    /**
     * @param theUserList the theUserList to set
     */
    public void setTheUserList(ArrayList<UserLogin> theUserList) {
        this.theUserList = theUserList;
    }
    
    public boolean authenticate(String username2check, String password2check){
        for (int i = 0; i < theUserList.size();i++){
            if(theUserList.get(i).authenticate(username2check, password2check)){
                return true;
            }
        }
        return false;
    }
}
