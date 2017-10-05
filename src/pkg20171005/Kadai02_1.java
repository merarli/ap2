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
public class Kadai02_1 {

    public static void main(String[] args) {
        Cat cat = new Cat();

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
                cat.setWeight(Double.parseDouble(word[7]));

//                tlist.add(cat);
                cat.printCat();

            }
//            for (Cat cat1 : tlist) {
//                cat.printCat();
//            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
