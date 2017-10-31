/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171031;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author merarli
 */
public class Ex53 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/meibo";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");

            //SQL文の作成
            String sql = "insert into T_STUDENT_A (fullname,gakubu_id,grade) values (?,?,?)";

            //PreparedStatementの作成
            PreparedStatement ps = con.prepareStatement(sql);

            //ファイル読み込み
            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/merarli/Downloads/student.csv")));


            //値の設定とSQL文の実行
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
            
            String[] word = line.split(",");
                
            ps.setString(1, word[0]);
            ps.setInt(2, Integer.parseInt(word[1]));
            ps.setInt(3, Integer.parseInt(word[2]));

            count += ps.executeLargeUpdate();
            
            }
            br.close();

            System.out.println(count + "件のレコードを追加しました");
            
            //メモリの開放
            ps.close();
            con.close();
            
        } catch (IOException | SQLException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
