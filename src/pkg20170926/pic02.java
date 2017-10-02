/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170926;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author merarli
 */
public class pic02 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1 = new File("/Users/merarli/OneDrive/ドキュメント/TUT/Maillist/CS/CS_16.txt");
        File outFile = new File("/Users/merarli/desktop/CS_16_2.txt");
        FileWriter fw = new FileWriter(outFile); 
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw); 
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            pw.println(line + "めあどですうう");
        }

        br.close();
        pw.close();
      
    }
}
