/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171102;

import pkg20171031.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author merarli
 */
public class Kadai05_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/twitter";


            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");
            Statement stmt = con.createStatement();

            //SQL文の作成
            String sql = "insert into T_TWEET (twitterid,tweettext,iine) values ('abc','おいしい',5)";

            //SQL文実行
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件のデータベースを追加");


            //メモリの開放
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
