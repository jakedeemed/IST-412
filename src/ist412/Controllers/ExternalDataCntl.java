/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jorge on 2/12/16.
 */
public class ExternalDataCntl{

    private String path;

    public ExternalDataCntl(String file_path){
        path = file_path;
    }

    ExternalDataCntl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] OpenFile() throws IOException{

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[ ] textData = new String[numberOfLines];

        int i;

        for (i=0; i < numberOfLines; i++) {
            textData[ i ] = textReader.readLine();

        }

        textReader.close();
        return textData;

    }

    int readLines() throws IOException {

        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();

        return numberOfLines;
    }


}

