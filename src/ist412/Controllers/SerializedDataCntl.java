/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Controllers;

/**
 *
 * @author Jorge
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.io.Serializable;
import ist412.Models.SerializedDataModel;


/**
 * Created by Jorge on 2/12/16.
 */
public class SerializedDataCntl implements Serializable{


    private SerializedDataModel theSerializedDataModel;
    private static SerializedDataCntl theSerializedDataCntl;
    private final String EXTERNAL_DATA_PATH = "";
    private final String HUB_DATA_FILE_NAME = "HubData.ser";
    private ExternalDataCntl theExtenalDataCntl;

    //Private to prevent instantiation.
    private SerializedDataCntl(){
        getSerializedDataModel();
    }

    //Singleton design pattern ensures there is only ever one SerializedCollectionCntl.

   
    public static SerializedDataCntl getSerializedDataCntl(){
        if(theSerializedDataCntl == null){
            theSerializedDataCntl = new SerializedDataCntl();
        }
        return theSerializedDataCntl;
    }

    // Returns the serialized data model
    // Creates test data if it is null
    public SerializedDataModel getSerializedDataModel(){
        if(theSerializedDataModel == null){
            readSerializedDataModel();
            if(theSerializedDataModel == null){
                theSerializedDataModel = new SerializedDataModel();
                writeSerializedDataModel();
            }
        }
        return theSerializedDataModel;
    }


    public void readSerializedDataModel(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        String filePath = EXTERNAL_DATA_PATH+HUB_DATA_FILE_NAME;
        try
        {
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            theSerializedDataModel = (SerializedDataModel) in.readObject();
            in.close();
        }
        catch(FileNotFoundException ex){
            //ex.printStackTrace();
            createTestSerializedDataModel();
            writeSerializedDataModel();
            readSerializedDataModel();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }


    public void writeSerializedDataModel(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        String filePath = EXTERNAL_DATA_PATH+HUB_DATA_FILE_NAME;
        try
        {
            fos = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(theSerializedDataModel);
            out.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }


    // Implement this to check that serialized data exists
    public void testPrintSerializedDataModel(){

    }

    public void getExtenalDataCntl(){
        theExtenalDataCntl = new ExternalDataCntl();
    }


    // This method creates some test data if the serialized data model is null.
    private void createTestSerializedDataModel(){
        theSerializedDataModel = new SerializedDataModel();
    }

}


