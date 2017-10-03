/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171003;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;

/**
 *
 * @author merarli
 */
public class Ex21 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(new File("/Users/merarli/OneDrive/document/NetBeansProjects/ap2/data/tweet.csv")));

            String line;

            while ((line = br.readLine()) != null) {

                String[] word = line.split(",");
                System.out.println("twitterID:" + word[0]);
                System.out.println("氏名" + word[1]);
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
