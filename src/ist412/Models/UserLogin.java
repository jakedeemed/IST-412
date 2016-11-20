/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;

import ist412.Controllers.SerializedDataCntl;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Richa
 */
public class UserLogin implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String username;
    private String password;
    private ArrayList<Account> theAccountList;
    private ArrayList<Budget> theBudgetList;
    private ArrayList<Expense> theExpenseList;
    
    public UserLogin(){
        
    }
    
    public UserLogin(String newUsername, String newPassword){
        this.username = newUsername;
        this.password = newPassword;
        theExpenseList = new ArrayList<Expense>();
        theBudgetList = new ArrayList<Budget>();
        theAccountList = new ArrayList<Account>();
        theExpenseList.add(new Expense("Test Date", "Test name", 0));
        theBudgetList.add(new Budget("Original Test Budget"));
        theAccountList.add(new Account("Original Test Account"));
        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
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
    
    public ArrayList<Expense> getTheExpenseList(){
        return theExpenseList;
    }
    
    public void setTheExpenseList(ArrayList<Expense> theExpenseList){
        this.theExpenseList = theExpenseList;
    }
    
    protected boolean authenticate(String unToCheck, String pwTocheck){
        if(this.getUsername().equals(unToCheck) && this.getPassword().equals(pwTocheck)){
            return true;
        }
        return false;
    }
}
