/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412;

import ist412.Controllers.SerializedDataCntl;
import ist412.Models.Budget;
import ist412.Models.User;
import ist412.Views.DashboardView;
import ist412.Views.LoginView;

/**
 *
 * @author jakedotts
 */
public class IST412 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        User testUser = new User("test");
        
        SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getUserList().getTheUserList().add(testUser);
        
        System.out.println(SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getUserList().getTheUserList().get(0));
        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
        User debugUser = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getUserList().getTheUserList().get(0);
        System.out.println(debugUser);
        System.out.println(debugUser.getTheBudgetList());
        
        
        LoginView initProgram = new LoginView();
        initProgram.setVisible(true);
        

        //DashboardView initProgram = new DashboardView();
        //initProgram.setVisible(true);
    }
    
}
