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
public class Budget implements Serializable {
    
    private String budgetName;
    private ArrayList<Expense> theExpenseList;
    private double budgetAmount = 0;
    
    public Budget(String budgetName){
        this.budgetName = budgetName;
        //this.budgetAmount = budgetAmount;
    }
    
    public Budget(String budgetName, double budgetAmount){
        this.budgetName = budgetName;
        this.budgetAmount = budgetAmount;
    }

    /**
     * @return the budgetName
     */
    public String getBudgetName() {
        return budgetName;
    }

    /**
     * @param budgetName the budgetName to set
     */
    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
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

    /**
     * @return the budgetAmount
     */
    public double getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * @param budgetAmount the budgetAmount to set
     */
    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
    
}
