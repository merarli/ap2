/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170926;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author merarli
 */
public class pic01 {
    public static void main(String[] args) {
//        File f1 = new File("/User/merarli/CS_16.txt");
        File f1 = new File("/Users/merarli/CS_16.txt");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.length());
        System.out.println(f1.getParentFile());
    }
    
}
