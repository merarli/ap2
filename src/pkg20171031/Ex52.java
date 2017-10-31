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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author merarli
 */
public class Ex52 {
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
            Statement stmt = con.createStatement();

            //SQL文の作成
            String sql = "insert into T_STUDENT_A (fullname,gakubu_id,grade) values (?,?,?)";
           
            PreparedStatement ps = con.prepareStatement(sql);
            
            //値をセット
            ps.setString(1, "てすおくん2");
            ps.setInt(2, 3);
            ps.setInt(3, 1);

            //SQL文実行
            int count = ps.executeUpdate();
            System.out.println(count + "件のデータベースを追加");


            //メモリの開放
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
