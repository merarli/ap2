/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171005;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author merarli
 */
public class Kadai02_2 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        double avW = 0;
        double countW = 0;
        double totalW = 0;
        double avY = 0;
        double countY = 0;
        double totalY = 0;

        List<Cat> tlist = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(new File("/Users/merarli/OneDrive/document/"
                            + "NetBeansProjects/ap2/data/data2.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                cat.setKenami(word[3]);
                cat.setColor(word[4]);
                cat.setSex(word[5]);
                
                cat.setAge(Integer.parseInt(word[6]));
                totalY += (Integer.parseInt(word[6]));
                countY ++;
                
                cat.setWeight(Double.parseDouble(word[7]));
                totalW += Double.parseDouble(word[7]);
                countW ++;

//                tlist.add(cat);
                cat.printCat();

            }
            System.out.println("登録されている平均体重；" + (totalW/countW) +"kgです。");
            System.out.println("登録されている平均年齢；" + totalY/countY +"歳です。");

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
