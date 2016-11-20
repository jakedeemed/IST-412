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
 * @author Jorge
 */
@Deprecated
public class User implements Serializable {
    
    private String userName;
    private ArrayList<Account> theAccountList;
    private ArrayList<Budget> theBudgetList;
    private ArrayList<Expense> theExpenseList;
    
    public User(String userName){
        this.userName = userName;
        this.theBudgetList = new ArrayList();
        this.theAccountList = new ArrayList();
        this.theExpenseList = new ArrayList();
        this.theExpenseList.add(new Expense("Test Date", "Test name", 0));
        this.theBudgetList.add(new Budget("Original Test Budget"));
        this.theAccountList.add(new Account("Original Test Account"));
        System.out.println(theBudgetList);
        System.out.println(theAccountList);
        System.out.println(theExpenseList);
        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
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
    
    public ArrayList<Expense> getTheExpenseList(){
        return theExpenseList;
    }
    
    public void setTheExpenseList(ArrayList<Expense> theExpenseList){
        this.theExpenseList = theExpenseList;
    }
    
}
