/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170928;

import pkg20170926.*;
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
public class Kadai01_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        double total = 0;
        double count = 0;
        String nameList = "名前リスト；";

        File f1 = new File("/Users/merarli/desktop/out11.txt");
        File outFile = new File("/Users/merarli/desktop/out12.txt");
        FileWriter fw = new FileWriter(outFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            try {
                total = total + Integer.parseInt(line);
                count = count + 1;
            } catch (java.lang.NumberFormatException e) {
                nameList += line + "/";
            }

            System.out.println(line.getClass());
            

        }

        pw.println(nameList);
        pw.print("平均点:" + total / count);
        br.close();
        pw.close();
        System.out.println(nameList);
        System.out.println("平均点；" + total / count);

    }
}
