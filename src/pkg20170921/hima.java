/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170921;

/**
 *
 * @author Merarli_S
 */
public class hima {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max =0;
        for (int data : n) {
            max = Math.max(max, data);
        }
        
        System.out.println(max);
    }

}
