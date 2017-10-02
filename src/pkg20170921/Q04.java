/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170921;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Merarli_S
 */
public class Q04 {
    public static void main(String[] args) {
        List<String> alist = new ArrayList();
        
        alist.add("Apple");
        alist.add("Orange");

//        alist.remove("Orange");
//          ↑の場合同じ名前が複数あった場合先頭の一つしか消えない
        alist.remove(1);
        alist.add("Banana");
        
        for(String data : alist){
            System.out.println(data);
        }
    }
}
