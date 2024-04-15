package com.tedu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    //封装一个方法获取链接
    public static Connection getConn() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?" +
                "characterEncoding=utf8&serverTimezone=Asia/Shanghai", "root", "root");
        //得到的链接对象 return
        return conn;
    }

}
