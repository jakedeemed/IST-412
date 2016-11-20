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
public class Account implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String accountName;
    private ArrayList<Account> theAccountList;
    private ArrayList<Expense> theExpenseList;
    
    public Account(String accountName){
        this.accountName = accountName;
        this.theExpenseList = new ArrayList();
        this.theExpenseList.add(new Expense("Test Date", "Test name", 0));
        System.out.println(theExpenseList);
        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
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
