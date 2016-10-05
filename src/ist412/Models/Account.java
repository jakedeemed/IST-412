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
class Account {
    
    private String accountName;
    private ArrayList<Expense> theExpenseList;
    
    public Account(String accountName){
        this.accountName = accountName;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the theExpenseList
     */
    public ArrayList<Expense> getTheExpenseList() {
        return theExpenseList;
    }

    /**
     * @param theExpenseList the theExpenseList to set
     */
    public void setTheExpenseList(ArrayList<Expense> theExpenseList) {
        this.theExpenseList = theExpenseList;
    }
    
}
