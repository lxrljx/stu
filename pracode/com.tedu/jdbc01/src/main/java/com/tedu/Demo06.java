package com.tedu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo06 {
    public static void main(String[] args) {
        try(Connection conn = DBUtils.getConn()) {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select username,nick,password from user");
            while (rs.next()){
                String username = rs.getString(1);
                String password= rs.getString(3);
                System.out.println(username+":"+password);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
