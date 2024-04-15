package com.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws SQLException {
        //1.得到连接对象 异常抛出
        /*DriverManager.getConnection()用于获取链接
        返回的Connection链接对象时JDBC程序连接数据库至关重要的一个对象
        参数2和参数3:分别是数据库用户名和数据库密码
        参数1:"jdbc:mysql://localhost:3306/empdb"
        是连接数据库的url,用于指定访问哪一个位置上
        的数据库服务器以及服务器中的哪一个数据库
        jdbc:mysql协议名称
        localhost:3306主机名(ip)和端口号
        empdb要连接的数据库
        *characterEncoding=utf8--->字符集
        serverTimezone=Asia/Shanghai--->时区
        * */
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?" +
                "characterEncoding=utf8&serverTimezone=Asia/Shanghai","root","root");
        System.out.println(conn);
        //2.创建执行SQL语句
        Statement s = conn.createStatement();
        //3.执行SQL语句
        s.execute("create table jdbc02t1(id int)");
        //4.关闭资源
        conn.close();
        System.out.println("创建完成");


    }
}
