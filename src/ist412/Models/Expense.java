/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;

import java.io.Serializable;

/**
 *
 * @author Jorge
 */
public class Expense implements Serializable {
    
    private String expenseName;
    private double expenseAmount;
    
    public Expense(String expenseName, double expenseAmount){
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
    }
    
}
