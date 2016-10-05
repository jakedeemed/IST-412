/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
class User {
    
    private String userName;
    private ArrayList<Account> theAccountList;
    private ArrayList<Budget> theBudgetList;
    
    public User(String userName){
        this.userName = userName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the theAccountList
     */
    public ArrayList<Account> getTheAccountList() {
        return theAccountList;
    }

    /**
     * @param theAccountList the theAccountList to set
     */
    public void setTheAccountList(ArrayList<Account> theAccountList) {
        this.theAccountList = theAccountList;
    }

    /**
     * @return the theBudgetList
     */
    public ArrayList<Budget> getTheBudgetList() {
        return theBudgetList;
    }

    /**
     * @param theBudgetList the theBudgetList to set
     */
    public void setTheBudgetList(ArrayList<Budget> theBudgetList) {
        this.theBudgetList = theBudgetList;
    }
    
}
