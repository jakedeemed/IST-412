/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;

import ist412.Controllers.SerializedDataCntl;
import java.io.Serializable;

/**
 *
 * @author Jorge
 */
public class Expense implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String expenseName;
    private double expenseAmount;
    private String expenseDate;
    
    public Expense(){
        
    }
    
    public Expense(String expenseDate, String expenseName, double expenseAmount){
        this.expenseDate = expenseDate;
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();

    }
    public String getExpenseName(){
        return expenseName;
    }
    public String getExpenseDate(){
        return expenseDate;
    }
    public Double getExpenseAmount(){
        return expenseAmount;
    }
    
}
