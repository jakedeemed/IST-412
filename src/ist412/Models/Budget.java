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
class Budget {
    
    private String budgetName;
    private ArrayList<Expense> theExpenseList;
    
    public Budget(String budgetName){
        this.budgetName = budgetName;
    }
    
}
