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
public class Q01 {

    public static void main(String[] args) {

        String str = "1024";
        int n = 0;
        try {
            n = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println("すうちにへんかんできません。");
        }
        int ans = n + 6;

        System.out.println(ans);
    }

}
