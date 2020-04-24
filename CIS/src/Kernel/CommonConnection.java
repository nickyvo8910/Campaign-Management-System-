package Kernel;

/*
 * @author: Lê Thanh Nhân| FPT University
 * : NhanLT@fpt.com.vn| L3nhan@gmail.com|
 * : +84.8.3925 2891| +84.942 64 3646
 * : NhanID
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class CommonConnection {
    public static Connection conn;
    public static Connection getCommonConnection(String database, String account, String password){
        try {
            String url="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(url);
            String dbUrl="jdbc:sqlserver://localhost:1433;databaseName=" + database;   
            //sqlserver://127.0.0.1\\MSSQLserver:1433
            conn=DriverManager.getConnection(dbUrl,account,password);
        } catch (Exception ex) {
            System.out.println("Cannot connect to " + database);
        }
        return conn;
    }
    public static Connection getCommonConnection(String server,String port,String database, String account, String password){
        try {
            String url="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(url);
            String dbUrl="jdbc:sqlserver://"+server+":"+port+";databaseName=" + database;   
            //sqlserver://127.0.0.1\\MSSQLserver:1433
            conn=DriverManager.getConnection(dbUrl,account,password);
        } catch (Exception ex) {
            System.out.println("Cannot connect to " + database);
        }
        return conn;
    }
}