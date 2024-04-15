package com.tedu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        //获取链接
        try(Connection conn = DBUtils.getConn()) {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select id from user where username='" + username + "'");
            //判断是否有数据
            if (rs.next()){
                System.out.println("用户名已存在");
                return;//结束方法
            }
            System.out.println("请输入密码");
            String password = sc.nextLine();
            System.out.println("请输入昵称");
            String nick = sc.nextLine();
            s.executeUpdate("insert into user values(null,'"+username+"','"+password+"','"+nick+"')");
            System.out.println("注册成功");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
