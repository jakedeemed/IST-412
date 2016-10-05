/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Models;


import java.io.IOException;
import java.io.Serializable;
import ist412.Controllers.SerializedDataCntl;
import ist412.Controllers.ExternalDataCntl;

/**
 * Created by Jorge on 2/12/16.
 */
public class SerializedDataModel implements Serializable{

    private UserList theUserList;

    public SerializedDataModel(){
        //theUserList = new UserList();
    }



    public UserList getUserList(){
        if(theUserList == null){
            theUserList = new UserList();
            SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
        }
        return theUserList;
    }

}
