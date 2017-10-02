/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170921;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Merarli_S
 */
public class Q05 {

    public static void main(String[] args) {
        // Dateクラスで、現在日時を取得
        Date d = new Date();


        SimpleDateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日 (E) HH時mm分ss秒");
        String q2 = d2.format(d); // format(d)のdは、Date d = new Date();のd
        System.out.println(q2); // 出力結果： 2016年08月05日 00時28分47秒

    }
}
