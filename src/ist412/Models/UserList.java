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
public class UserList implements Serializable {
    
    private ArrayList<User> theUserList;
    
    public UserList(){
        theUserList = new ArrayList();
    }

    /**
     * @return the theUserList
     */
    public ArrayList<User> getTheUserList() {
        return theUserList;
    }

    /**
     * @param theUserList the theUserList to set
     */
    public void setTheUserList(ArrayList<User> theUserList) {
        this.theUserList = theUserList;
    }
    
}
